package com.korit.crud;
import java.sql.Connection;
import java.util.*;

import com.korit.crud.controller.AuthController;
import com.korit.crud.controller.BoardController;
import com.korit.crud.controller.UserController;
import com.korit.crud.controller.implement.AuthControllerImplement;
import com.korit.crud.controller.implement.BoardControllerImplement;
import com.korit.crud.controller.implement.UserControllerImpliment;
import com.korit.crud.db.MySQLConnector;
import com.korit.crud.dto.auth.DeleteSignInUserRequestDto;
import com.korit.crud.dto.auth.PatchSigninUserRequestDto;
import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.dto.board.CreateBoardDto;
import com.korit.crud.dto.board.UpdateBoardRequestDto;
import com.korit.crud.dto.board.ViewPostDetailRequestDto;
import com.korit.crud.repository.BoardRepository;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.repository.implement.BoardRepositoryImplement;
import com.korit.crud.repository.implement.UserRepositoryImplement;
import com.korit.crud.service.AuthService;
import com.korit.crud.service.BoardService;
import com.korit.crud.service.UserService;
import com.korit.crud.service.implement.AuthServiceImplement;
import com.korit.crud.service.implement.BoardServiceImplement;
import com.korit.crud.service.implement.UserServiceImplement;


public class CrudApplication {

	public static String SESSION = null;
	
	public static void main(String[] args) {
		
		Connection connection = MySQLConnector.getInstance().getConnection();
		
		UserRepository userRepository = new UserRepositoryImplement(connection);
		AuthService authService = new AuthServiceImplement(userRepository);
		UserService userService = new UserServiceImplement(userRepository);
		// 기능단위 구현은 참조변수의 타입은 인터페이스로, 생성자는 구현체로 설정
		AuthController authController = new AuthControllerImplement(authService);
		UserController userController = new UserControllerImpliment(userService);
		
		BoardRepository boardRepository = new BoardRepositoryImplement(connection, userRepository);
		BoardService boardService = new BoardServiceImplement(boardRepository, userRepository);
		BoardController boardController = new BoardControllerImplement(boardService);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			String job = SESSION == null ? "(로그인, 회원가입)" : "(정보보기, 정보수정, 정보삭제, 게시판)";
			
			System.out.print("작업 " + job + " : ");
			
			String request = scanner.nextLine();
			
			if(request.equals("exit")) break;
			
			if(request.equals("회원가입")) {
				SignUpRequestDto requestDto = new SignUpRequestDto();
				authController.signUp(requestDto);
			}
			
			if(request.equals("로그인")) {
				SignInRequestDto requestDto = new SignInRequestDto();
				authController.signIn(requestDto);
			}
			
			if(request.equals("정보보기")) {
				userController.getSignInUser();
			}
			if(request.equals("정보수정")) {
				PatchSigninUserRequestDto requestDto = new PatchSigninUserRequestDto();
				userController.patchSignInUser(requestDto);
			}
			if(request.equals("정보삭제")) {
				DeleteSignInUserRequestDto requestDto = new DeleteSignInUserRequestDto();
				userController.deleteSignInUser(requestDto);
			}
			if(request.equals("게시판")) {
				
				while(true) {
					Scanner boardScanner = new Scanner(System.in);
					System.out.print("게시판 작업(작성, 리스트 보기, 상세 보기, 수정, 삭제) : ");
					String boardRequest = boardScanner.nextLine();
					if(boardRequest.equals("작성")) {
						CreateBoardDto requestDto = new CreateBoardDto();
						boardController.createPost(requestDto);
						break;
					}
					if(boardRequest.equals("리스트 보기")) {
						boardController.viewPostAll();
						break;
					}
					if(boardRequest.equals("상세 보기")) {
						ViewPostDetailRequestDto requestDto = new ViewPostDetailRequestDto();
						boardController.viewPostDetail(requestDto);
						System.out.println("===================");
						break;
					}
					if(boardRequest.equals("수정")) {
						UpdateBoardRequestDto updateRequestDto = new UpdateBoardRequestDto();
						boardController.updatePost(updateRequestDto);
						break;
					}
					if(boardRequest.equals("삭제")) {
						UpdateBoardRequestDto updateRequestDto = new UpdateBoardRequestDto();
						boardController.deletePost(updateRequestDto);
						break;
					}
					
				}
				
			}
			
		}
		
		scanner.close();
		
	}

}
