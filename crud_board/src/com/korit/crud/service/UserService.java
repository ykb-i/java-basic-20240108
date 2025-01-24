package com.korit.crud.service;

import com.korit.crud.dto.auth.DeleteSignInUserRequestDto;
import com.korit.crud.dto.auth.PatchSigninUserRequestDto;

public interface UserService {
	void getSignInUser(String id);
	
	void patchSingInUser(String id, PatchSigninUserRequestDto requestDto);
	
	void deleteSignInUser(String id, DeleteSignInUserRequestDto requestDto);
}
