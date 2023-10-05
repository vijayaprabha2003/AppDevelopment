package com.codemancer.viji.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserResponseDto {
	private String id ;
private String fullname ;	
private String username ;
private int age;
private String email ;
private String password ;
private String confirmpassword ;
}