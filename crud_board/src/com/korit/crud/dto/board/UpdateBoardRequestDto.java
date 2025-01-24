package com.korit.crud.dto.board;

import java.util.Scanner;

public class UpdateBoardRequestDto {
	private int postNum;
	
	public UpdateBoardRequestDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게시물 번호 : ");
		this.postNum = scanner.nextInt();
	}

	public int getPostNum() {
		return postNum;
	}
	
	
}
