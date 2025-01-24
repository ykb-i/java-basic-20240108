package com.korit.crud.controller.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.controller.UserController;
import com.korit.crud.dto.auth.DeleteSignInUserRequestDto;
import com.korit.crud.dto.auth.PatchSigninUserRequestDto;
import com.korit.crud.service.UserService;

public class UserControllerImpliment implements UserController{
	
	private final UserService userService;
	
	public UserControllerImpliment(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void getSignInUser() {
		// 로그인 유저 아이디
		String id = CrudApplication.SESSION;
		// 두가지 의미
		// 1. null pointer 예외가 발생하는것을 방지
		// 2. id == null이면 로그인이 되어있지 않기 때문에 동작을 할 수 없
		if(id == null) {
			System.out.println("로그인이 되어 있지 않습니다.");
			return;
		}
		userService.getSignInUser(id);
	}

	@Override
	public void patchSignInUser(PatchSigninUserRequestDto requestDto) {
		String id = CrudApplication.SESSION;
		
		if(id == null) {
			System.out.println("로그인이 되어 있지 않습니다.");
			return;
		}
		
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		
		if(!requestDto.validateNickname()) return;
		
		userService.patchSingInUser(id, requestDto);
	}

	@Override
	public void deleteSignInUser(DeleteSignInUserRequestDto requestDto) {
		String id = CrudApplication.SESSION;
		
		if(id == null) {
			System.out.println("로그인이 되어 있지 않습니다.");
			return;
		}
		
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		
		if(!requestDto.validatePassword()) return;
		
		userService.deleteSignInUser(id, requestDto);
	}
	
	
}
