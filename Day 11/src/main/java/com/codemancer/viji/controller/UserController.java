package com.codemancer.viji.controller;



import java.util.List;



import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.codemancer.viji.dto.request.UserRequestDto;

import com.codemancer.viji.dto.response.UserResponseDto;

import com.codemancer.viji.service.UserService;



import lombok.RequiredArgsConstructor;



@RestController

@RequestMapping("/api/v1/user")

@RequiredArgsConstructor

public class UserController {

	

	private final UserService userService ;

	

	@PostMapping("/save")

	public ResponseEntity<String> saveUser(@RequestBody UserRequestDto userRequest)

	{

		boolean isDataSaved = userService.saveUser(userRequest) ;

		return isDataSaved ? ResponseEntity.status(200).body("User Added Successfully") : 

			ResponseEntity.status(404).body("Something went wrong");

		

	}

	

	@GetMapping("/all")

	public ResponseEntity<List<UserResponseDto>> getAllUser(){

		List<UserResponseDto> userList = userService.getAllUser() ;

		return userList.size() > 0 ? ResponseEntity.status(200).body(userList) : ResponseEntity.status(404).body(userList) ;

	}
	

}