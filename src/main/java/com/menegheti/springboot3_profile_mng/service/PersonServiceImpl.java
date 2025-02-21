package com.menegheti.springboot3_profile_mng.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.menegheti.springboot3_profile_mng.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{
	
	
	
	@Override
	public Page<Person> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person saveOrUpdate(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByID(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
