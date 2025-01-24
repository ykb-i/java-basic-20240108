package com.korit.crud.entity;

// 
import java.sql.Date;

import com.korit.crud.dto.board.CreateBoardDto;

public class BoardEntity {
	private String name;
	private String content;
	
	public BoardEntity(CreateBoardDto requestDto) {
		this.name = requestDto.getName();
		this.content = requestDto.getContent();
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}
	
}
