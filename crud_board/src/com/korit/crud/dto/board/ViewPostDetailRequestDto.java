package com.korit.crud.dto.board;

import java.util.Scanner;

public class ViewPostDetailRequestDto {
	private int postNum;
	
	public ViewPostDetailRequestDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("게시물 번호: ");
		this.postNum = scanner.nextInt();
	}

	public int getPostNum() {
		return postNum;
	}
}
