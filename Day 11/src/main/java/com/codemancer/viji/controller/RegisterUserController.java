package com.codemancer.viji.controller;



import java.util.List;



import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.codemancer.viji.dto.request.RegisterUserRequestDto;

import com.codemancer.viji.dto.response.RegisterUserResponseDto;

import com.codemancer.viji.service.RegisterUserService;



import lombok.RequiredArgsConstructor;



@RestController

@RequestMapping("/api/v1/user")

@RequiredArgsConstructor

public class RegisterUserController {

	

	private final RegisterUserService userService ;

	

	@PostMapping("/saveregister")

	public ResponseEntity<String> saveUser(@RequestBody RegisterUserRequestDto userRequest)
	

	{

		boolean isDataSaved = userService.saveUser(userRequest) ;

		return isDataSaved ? ResponseEntity.status(200).body("User Added Successfully") : 

			ResponseEntity.status(404).body("Something went wrong");

		

	}

	

	@GetMapping("/allregister")

	public ResponseEntity<List<RegisterUserResponseDto>> getAllUser(){

		List<RegisterUserResponseDto> userList = userService.getAllUser() ;

		return userList.size() > 0 ? ResponseEntity.status(200).body(userList) : ResponseEntity.status(404).body(userList) ;

	}
	

}