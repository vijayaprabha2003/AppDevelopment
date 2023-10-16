package com.codemancer.vichu.dto.response;

import com.codemancer.vichu.model.enumerate.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long uid;
    private String user;
    private String email;
    private Boolean isEnabled;
    private Role role;
}
