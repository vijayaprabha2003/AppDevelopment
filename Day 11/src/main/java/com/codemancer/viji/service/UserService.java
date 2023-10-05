package com.codemancer.viji.service;



import java.util.List;



import com.codemancer.viji.dto.request.UserRequestDto;

import com.codemancer.viji.dto.response.UserResponseDto;



public interface UserService {



	boolean saveUser(UserRequestDto userRequest);



	List<UserResponseDto> getAllUser();



}

