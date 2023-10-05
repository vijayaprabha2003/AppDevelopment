package com.codemancer.viji.service.impl;



import java.util.ArrayList;

import java.util.List;

import java.util.Optional;



import org.springframework.stereotype.Service;



import com.codemancer.viji.dto.request.RegisterUserRequestDto;

import com.codemancer.viji.dto.response.RegisterUserResponseDto;

import com.codemancer.viji.model.RegisterUser;

import com.codemancer.viji.repository.RegisterUserRepository;

import com.codemancer.viji.service.RegisterUserService;



import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;



@Service

@Transactional

@RequiredArgsConstructor

public class RegisterUserServiceImpl implements RegisterUserService{



	private final RegisterUserRepository userRepository ;

	

	@Override

	public boolean saveUser(RegisterUserRequestDto userRequest) {

		Optional<RegisterUser> isUserOptional = userRepository.existsByEmail(userRequest.getEmail()) ;

		if(isUserOptional.isPresent()) {

			var data = RegisterUser.builder()
					.fullname(userRequest.getFullname())
					.username(userRequest.getUsername())
					.age(userRequest.getAge())
					.email(userRequest.getEmail())
					.password(userRequest.getPassword())
					.confirmpassword(userRequest.getConfirmpassword())
					.build() ;

			userRepository.save(data) ;

			return true ;

		}else

		{

			return false ;

		}

	}



	@Override

	public List<RegisterUserResponseDto> getAllUser() {

		List<RegisterUser> userList = userRepository.findAll() ;

		List<RegisterUserResponseDto> userResponseList = new ArrayList<>() ;

		RegisterUserResponseDto userResponse = new RegisterUserResponseDto() ;

		for(RegisterUser user: userList) {

			userResponse.setId(user.getId());
			
			userResponse.setFullname(user.getFullname());

			userResponse.setUsername(user.getUsername());

			userResponse.setEmail(user.getEmail());
			
			userResponse.setAge(user.getAge());

			userResponse.setPassword(user.getPassword());
			
			userResponse.setConfirmpassword(user.getConfirmpassword());

			userResponseList.add(userResponse) ;

		}

		return userResponseList;

	}



}