package com.codemancer.viji.service;



import java.util.List;



import com.codemancer.viji.dto.request.RegisterUserRequestDto;

import com.codemancer.viji.dto.response.RegisterUserResponseDto;



public interface RegisterUserService {



	boolean saveUser(RegisterUserRequestDto userRequest);



	List<RegisterUserResponseDto> getAllUser();



}

