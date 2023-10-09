package com.codemancer.vichu.controller;

	

	import java.util.List;

	

	import org.springframework.beans.factory.annotation.Autowired;



	import org.springframework.web.bind.annotation.DeleteMapping;

	import org.springframework.web.bind.annotation.GetMapping;



	import org.springframework.web.bind.annotation.PostMapping;

	import org.springframework.web.bind.annotation.PutMapping;

	import org.springframework.web.bind.annotation.RequestBody;

	import org.springframework.web.bind.annotation.RequestMapping;

	import org.springframework.web.bind.annotation.RequestParam;

	import org.springframework.web.bind.annotation.RestController;

	

	import com.codemancer.vichu.model.*;

	
import com.codemancer.vichu.repository.PolicyRepository;

	

	

	@RequestMapping("/api/policy")

	@RestController

	public class PolicyController {

	@Autowired

	PolicyRepository repo ;

	@PostMapping("/add")

	public Policy save(@RequestBody Policy user)

	{

	return repo.save(user) ;

	}

	@GetMapping("/get")

	public List<Policy> get(Policy user)

	{

		return repo.findAll() ;

	}

	@PutMapping("update")

	public Policy update(@RequestBody Policy user)

	{

	return repo.saveAndFlush(user) ;

	}

	@DeleteMapping("/delete")

	public String delete(@RequestParam long id)

	{

		repo.deleteById(id) ;

		return "DELETED SUCCESSFULLY" ;

	}

	

	}