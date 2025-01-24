package com.korit.crud.service.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.dto.board.CreateBoardDto;
import com.korit.crud.dto.board.UpdateBoardRequestDto;
import com.korit.crud.dto.board.ViewPostDetailRequestDto;
import com.korit.crud.entity.BoardEntity;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.BoardRepository;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.service.BoardService;

public class BoardServiceImplement implements BoardService {

    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    public BoardServiceImplement(BoardRepository boardRepository, UserRepository userRepository) {
        this.boardRepository = boardRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createPost(CreateBoardDto requestDto) {
        String id = CrudApplication.SESSION;
        
        
        UserEntity userEntity = userRepository.findById(id);
        String nickname = userEntity.getNickname();

        BoardEntity boardEntity = new BoardEntity(requestDto);
        boardRepository.savePost(boardEntity, nickname);
        System.out.println("작성에 성공했습니다.");
    }

    @Override
    public void viewPostAll() {
        boardRepository.viewPostAll();
    }

    @Override
    public void viewPostDetail(ViewPostDetailRequestDto requestDto) {
        int postNum = requestDto.getPostNum();
        boardRepository.viewPostDetail(postNum);
    }

    @Override
    public void updatePost(UpdateBoardRequestDto updateRequestDto) {
        String id = CrudApplication.SESSION;
        int postNum = updateRequestDto.getPostNum();

        if (isAuthorizedToModifyPost(postNum, id)) {
            CreateBoardDto createRequestDto = new CreateBoardDto();
            BoardEntity boardEntity = new BoardEntity(createRequestDto);
            boardRepository.updatePost(boardEntity, postNum);
            System.out.println("수정에 성공했습니다.");
        }
    }

    @Override
    public void deletePost(UpdateBoardRequestDto requestDto) {
        String id = CrudApplication.SESSION;
        int postNum = requestDto.getPostNum();

        if (isAuthorizedToModifyPost(postNum, id)) {
            boardRepository.deletePost(postNum);
            System.out.println("삭제에 성공했습니다.");
        }
    }

    private boolean isAuthorizedToModifyPost(int postNum, String userId) {
        if (!boardRepository.ExistByPostNum(postNum)) {
            System.out.println("(존재하지 않는 게시물)");
            System.out.println("존재하지 않는 게시물입니다.");
            return false;
        }

        if (!boardRepository.EqualByPostNum(postNum, userId)) {
            System.out.println("(로그인한 사용자가 작성자가 아님)");
            System.out.println("권한이 없습니다.");
            return false;
        }

        return true;
    }
}
