package com.microservices.authservermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.authservermicroservice.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}