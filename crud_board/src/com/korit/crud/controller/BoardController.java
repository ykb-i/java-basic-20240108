package com.korit.crud.controller;

import com.korit.crud.dto.board.CreateBoardDto;
import com.korit.crud.dto.board.UpdateBoardRequestDto;
import com.korit.crud.dto.board.ViewPostDetailRequestDto;

public interface BoardController {
	void createPost(CreateBoardDto requestDto);
	void viewPostAll();
	void viewPostDetail(ViewPostDetailRequestDto requestDto);
	void updatePost(UpdateBoardRequestDto requestDto);
	void deletePost(UpdateBoardRequestDto requestDto);
}
