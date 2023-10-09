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

	import com.codemancer.vichu.repository.ApplicationUserRepository;

	

	

	@RequestMapping("/api/apply")

	@RestController

	public class ApplicationUserController {

	@Autowired

	ApplicationUserRepository repo ;

	@PostMapping("/add")

	public ApplicationUser save(@RequestBody ApplicationUser user)

	{

	return repo.save(user) ;

	}

	@GetMapping("/get")

	public List<ApplicationUser> get(ApplicationUser user)

	{

		return repo.findAll() ;

	}

	@PutMapping("update")

	public ApplicationUser update(@RequestBody ApplicationUser user)

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