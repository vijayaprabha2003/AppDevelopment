package com.codemancer.vichu.model;





import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;









@Entity

@Table(name = "_policy")

public class Policy {

	@Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @Column(length = 50, nullable = false)

    private String policy_name;

    

    @Column(length = 50, nullable = false)

    private String available_vacants;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPolicy_name() {
		return policy_name;
	}



	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}



	public String getAvailable_vacants() {
		return available_vacants;
	}



	public void setAvailable_vacants(String available_vacants) {
		this.available_vacants = available_vacants;
	}



	public Policy(Long id, String policy_name, String available_vacants) {
		super();
		this.id = id;
		this.policy_name = policy_name;
		this.available_vacants = available_vacants;
	}
public Policy()
{
	
}
    

    

}