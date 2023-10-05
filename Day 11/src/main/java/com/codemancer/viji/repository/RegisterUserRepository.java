package com.codemancer.viji.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemancer.viji.model.RegisterUser;

public interface RegisterUserRepository extends JpaRepository<RegisterUser, String>{

Optional<RegisterUser> existsByEmail(String email);

}
