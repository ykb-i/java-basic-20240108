package com.korit.crud.dto.board;

import java.sql.Date;
import java.util.Scanner;

public class CreateBoardDto {
	private String name;
	private String content;
	
	public CreateBoardDto(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("제목: ");
		this.name = scanner.nextLine();
		System.out.println("내용: ");
		this.content = scanner.nextLine();
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}
	
	public boolean validatePost() {
		if(!isNotNull()) {
			System.out.println("================");
			System.out.println("(필수 미입력)");
			System.out.println("모두 입력해주세요.");
			return false;
		}
		
		return true;
	}
	
	private boolean isNotNull() {
	    return name != null && !name.trim().isEmpty() && 
	           content != null && !content.trim().isEmpty();
	}

}
