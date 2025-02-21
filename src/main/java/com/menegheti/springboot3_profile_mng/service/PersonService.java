package com.menegheti.springboot3_profile_mng.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.menegheti.springboot3_profile_mng.entity.Person;

public interface PersonService {
	Page<Person> findAll(Pageable pageable);
	
	Optional<Person> findById(Long id);
	
	boolean existById(Long id);
	
	Person saveOrUpdate(Person person);
	
	boolean deleteByID(Long id);
	
}
