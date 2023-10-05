package com.codemancer.viji.service.impl;



import java.util.ArrayList;

import java.util.List;

import java.util.Optional;



import org.springframework.stereotype.Service;



import com.codemancer.viji.dto.request.UserRequestDto;

import com.codemancer.viji.dto.response.UserResponseDto;

import com.codemancer.viji.model.User;

import com.codemancer.viji.repository.UserRepository;

import com.codemancer.viji.service.UserService;



import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;



@Service

@Transactional

@RequiredArgsConstructor

public class UserServiceImpl implements UserService{



	private final UserRepository userRepository ;

	

	@Override

	public boolean saveUser(UserRequestDto userRequest) {

		Optional<User> isUserOptional = userRepository.existsByEmail(userRequest.getEmail()) ;

		if(isUserOptional.isPresent()) {

			var data = User.builder().username(userRequest.getUsername()).email(userRequest.getEmail()).password(userRequest.getPassword()).build() ;

			userRepository.save(data) ;

			return true ;

		}else

		{

			return false ;

		}

	}



	@Override

	public List<UserResponseDto> getAllUser() {

		List<User> userList = userRepository.findAll() ;

		List<UserResponseDto> userResponseList = new ArrayList<>() ;

		UserResponseDto userResponse = new UserResponseDto() ;

		for(User user: userList) {

			userResponse.setId(user.getId());

			userResponse.setUsername(user.getUsername());

			userResponse.setEmail(user.getEmail());

			userResponse.setPassword(user.getPassword());

			userResponseList.add(userResponse) ;

		}

		return userResponseList;

	}



}