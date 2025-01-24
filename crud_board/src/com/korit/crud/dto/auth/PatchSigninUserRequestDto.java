package com.korit.crud.dto.auth;

import java.util.Scanner;

public class PatchSigninUserRequestDto {
	private String nickname;
	
	public PatchSigninUserRequestDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 닉네임을 입력해주세요: ");
		this.nickname = scanner.nextLine();
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public boolean validateNickname() {
		if(!isNotNull()) {
			System.out.println("닉네임은 비어있거나 공백으로만 구성할 수 없습니다.");
			return false;
		}
		
		return true;
	}
	
	private boolean isNotNull() {
		return nickname != null && !nickname.isBlank();
	}
}
