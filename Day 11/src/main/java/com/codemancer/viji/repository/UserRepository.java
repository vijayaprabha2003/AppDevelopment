package com.codemancer.viji.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemancer.viji.model.User;

public interface UserRepository extends JpaRepository<User, String>{

Optional<User> existsByEmail(String email);

}
