package com.korit.crud.controller;

import com.korit.crud.dto.auth.DeleteSignInUserRequestDto;
import com.korit.crud.dto.auth.PatchSigninUserRequestDto;

public interface UserController {
	void getSignInUser();
	void patchSignInUser(PatchSigninUserRequestDto requestDto);
	void deleteSignInUser(DeleteSignInUserRequestDto requestDto);
}
