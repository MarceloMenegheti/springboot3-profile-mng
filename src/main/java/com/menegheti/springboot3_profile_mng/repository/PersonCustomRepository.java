package com.menegheti.springboot3_profile_mng.repository;

import java.util.List;

import com.menegheti.springboot3_profile_mng.entity.Person;

public interface PersonCustomRepository {
	public Person saveOrUpdate(Person person);
	public List<Person> findPersonByFirstNameAndLastNameOrderByUserNameAsc(String firstName, String lastName);
}
