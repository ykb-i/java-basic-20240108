package com.korit.crud.dto.auth;

import java.util.Scanner;

public class DeleteSignInUserRequestDto {
	
	private String password;
	
	public DeleteSignInUserRequestDto(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 삭제하시려면 비밀번호를 입력하세요: ");
		this.password = scanner.nextLine();
	}

	public String getPassword() {
		return password;
	}
	
	public boolean validatePassword() {
		if(!isNotNull()) {
			System.out.println("올바르지 않은 비밀번호입니다.");
			return false;
		}
		
		return true;
	}
	private boolean isNotNull() {
		return password != null;
	}
}
