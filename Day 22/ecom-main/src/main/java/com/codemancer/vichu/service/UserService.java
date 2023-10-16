package com.codemancer.vichu.service;

import java.util.List;

import com.codemancer.vichu.dto.request.UserRequest;
import com.codemancer.vichu.dto.response.UserResponse;

public interface UserService {

    List<UserResponse> getAllUsers();

    UserResponse getUser(Long uid);

    UserResponse updateUser(UserRequest request, Long uid);

    boolean deleteProduct(Long uid);

}
