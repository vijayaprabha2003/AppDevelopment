package com.codemancer.vichu.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.codemancer.vichu.model.*;



@Repository

public interface PolicyRepository extends JpaRepository<Policy, Integer>{



}