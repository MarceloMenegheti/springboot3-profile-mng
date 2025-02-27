package com.menegheti.springboot3_profile_mng.service;

import java.util.Optional;

import com.menegheti.springboot3_profile_mng.exception.PersonDeleteByIdFailedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.menegheti.springboot3_profile_mng.entity.Person;
import com.menegheti.springboot3_profile_mng.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	private final PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public Page<Person> findAll(Pageable pageable) {
		return personRepository.findAll(pageable);
	}

	@Override
	public Optional<Person> findById(Long id) {
		return personRepository.findById(id);
	}

	@Override
	public boolean existById(Long id) {
		return personRepository.existsById(id);
	}

	@Override
	public Person saveOrUpdate(Person person) {
		return personRepository.saveOrUpdate(person);
	}

	@Override
	public boolean deleteByID(Long id) {
		if(personRepository.existsById(id)) {
			personRepository.deleteById(id);
			if(personRepository.existsById(id)) {
				throw new PersonDeleteByIdFailedException("Pessoa ID = " +id+" existe no Banco de Dados mas nao foi deletada! ");
			}
			return true;
		}else {
		return false;
		}
	}

}
