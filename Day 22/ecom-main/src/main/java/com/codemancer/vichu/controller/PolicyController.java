package com.codemancer.vichu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemancer.vichu.model.Policy;
import com.codemancer.vichu.repository.PolicyRepository;


@RestController
@RequestMapping("/api/policy")
@CrossOrigin
public class PolicyController {
@Autowired

private PolicyRepository policyRepository ;


@PostMapping("/add")
public Policy add(final @RequestBody Policy policy)
{
return policyRepository.save(policy) ;

}
@GetMapping("/get")
public List<Policy> getAllStudent()
{
return policyRepository.findAll() ;
}
@GetMapping("/gets/{id}")
public Policy getAllStudents(@PathVariable int id)
{
return policyRepository.findById(id).orElse(null) ;
}
@PutMapping("/update/{id}")
public ResponseEntity<Policy> updatePolicy(@RequestBody Policy updatedPolicy, @PathVariable int id) {
    Optional<Policy> policyOptional = policyRepository.findById(id);

    if (policyOptional.isPresent()) {
        Policy existingPolicy = policyOptional.get();
        existingPolicy.setPolicy_name(updatedPolicy.getPolicy_name());
        existingPolicy.setAvailable_vacants(updatedPolicy.getAvailable_vacants());
        policyRepository.save(existingPolicy);
        return new ResponseEntity<>(existingPolicy, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return a 404 status if the policy with the given ID is not found.
    }
}

@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id)
{
policyRepository.deleteById(id) ;
return "Deleted Successfully" ;
}

}
