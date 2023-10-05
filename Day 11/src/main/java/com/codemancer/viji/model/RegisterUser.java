package com.codemancer.viji.model;



import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;

import lombok.NoArgsConstructor;



@Data

@Builder

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name = "_registeruser")

public class RegisterUser {

	@Id

	@GeneratedValue(strategy = GenerationType.UUID)

	private String id ;
	
	@Column(length = 30, nullable = false)

	private String fullname ;

	@Column(length = 30, nullable = false)

	private String username ;
	
	@Column(length = 30, nullable = false)

	private int age ;

	@Column(length = 50, nullable = false)

	private String email ;

	@Column(nullable = false)

	private String password ;
	
	@Column(nullable = false)

	private String confirmpassword ;
	

	

}