package com.codemancer.vichu.service;

import com.codemancer.vichu.dto.request.AuthenticationRequest;
import com.codemancer.vichu.dto.request.RegisterRequest;
import com.codemancer.vichu.dto.response.AuthenticationResponse;

public interface AuthService {
    boolean userRegistration(RegisterRequest request);

    AuthenticationResponse userAuthentication(AuthenticationRequest request);
}
