package com.korit.crud.service;

import com.korit.crud.dto.board.CreateBoardDto;
import com.korit.crud.dto.board.UpdateBoardRequestDto;
import com.korit.crud.dto.board.ViewPostDetailRequestDto;

public interface BoardService {
	void createPost(CreateBoardDto requestDto);
	void viewPostAll();
	void viewPostDetail(ViewPostDetailRequestDto requestDto);
	void updatePost(UpdateBoardRequestDto updateRequestDto);
	void deletePost(UpdateBoardRequestDto requestDto);
}

