package com.korit.crud.service.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.dto.auth.DeleteSignInUserRequestDto;
import com.korit.crud.dto.auth.PatchSigninUserRequestDto;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.service.UserService;

public class UserServiceImplement implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void getSignInUser(String id) {
		
		// 유저 정보를 저장소에서 불러오기
		// (내가 직접 만들때 몰랐던거)
		// userEntity가 null을 받을 가능성이 있기 때문에 유효성 검증을 해야 함.
		UserEntity userEntity = userRepository.findById(id);
		if(userEntity == null) {
			System.out.println("존재하지 않는 id입니다.");
			return;
		}
		System.out.println("아이디 : " + userEntity.getId() + " / 닉네임 : " + userEntity.getNickname());
	}

	@Override
	public void patchSingInUser(String id, PatchSigninUserRequestDto requestDto) {
		boolean existedUser = userRepository.existsById(id);
		if (!existedUser) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		String nickname = requestDto.getNickname();
		userRepository.updateByNickname(id, nickname);
	}

	@Override
	public void deleteSignInUser(String id, DeleteSignInUserRequestDto requestDto) {
		UserEntity userEntity = userRepository.findById(id);
		if(userEntity == null) {
			System.out.println("존재하지 않는 id입니다.");
			return;
		}
		
		String password = requestDto.getPassword();
		String existPassword = userEntity.getPassword();
		if(!password.equals(existPassword)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
//		위에서 findById를 돌렸기 때문에 deleteById로 똑같은 작업을 할 필요가 없음
//		userRepository.deleteById(id);
		
		userRepository.deleteOne(userEntity);
		CrudApplication.SESSION = null;
		System.out.println("유저 정보를 삭제했습니다.");
	}
	
	

}
