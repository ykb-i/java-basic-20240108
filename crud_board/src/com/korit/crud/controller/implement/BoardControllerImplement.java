package com.korit.crud.controller.implement;

import com.korit.crud.controller.BoardController;
import com.korit.crud.dto.board.CreateBoardDto;
import com.korit.crud.dto.board.UpdateBoardRequestDto;
import com.korit.crud.dto.board.ViewPostDetailRequestDto;
import com.korit.crud.service.BoardService;

public class BoardControllerImplement implements BoardController {
	
	private final BoardService boardService;
	
	public BoardControllerImplement(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@Override
	public void createPost(CreateBoardDto requestDto) {
		 if(requestDto == null) {
			 System.out.println("오류가 발생했습니다.");
			 return;
		 }
		 
		 if(!requestDto.validatePost()) return;
		 
		 boardService.createPost(requestDto);
	}

	@Override
	public void viewPostAll() {
		boardService.viewPostAll();
	}

	@Override
	public void viewPostDetail(ViewPostDetailRequestDto requestDto) {
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
		}
		
		if(requestDto.getPostNum() <= 0) {
			System.out.println("유효하지 않은 번호입니다.");
		}
		
		boardService.viewPostDetail(requestDto);
		
	}

	@Override
	public void updatePost(UpdateBoardRequestDto updateRequestDto) {
		if(updateRequestDto == null) {
			System.out.println("오류가 발생했습니다.");
		}
		
		boardService.updatePost(updateRequestDto);
	}

	@Override
	public void deletePost(UpdateBoardRequestDto requestDto) {
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
		}
		
		boardService.deletePost(requestDto);
	}

}
