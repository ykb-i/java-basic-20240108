package com.korit.crud.repository;

import com.korit.crud.entity.BoardEntity;
import com.korit.crud.entity.UserEntity;

public interface BoardRepository {
	void savePost(BoardEntity boardEntity, String nickname);
	void viewPostAll();
	void viewPostDetail(int postNum);
	boolean ExistByPostNum(int postNum);
	boolean EqualByPostNum(int postNum, String id);
	void updatePost(BoardEntity boardEntity, int postNum);
	void deletePost(int postNum);
}
