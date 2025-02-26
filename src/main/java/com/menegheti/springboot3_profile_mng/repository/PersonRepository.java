package com.menegheti.springboot3_profile_mng.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.menegheti.springboot3_profile_mng.entity.Person;


@Repository
public interface PersonRepository extends ListCrudRepository<Person, Long>, PagingAndSortingRepository<Person, Long>, PersonCustomRepository{
	
	//criando um metodo costumizado, definindo como deve ser implementado pelo spring
	@Query(value="SELECT * FROM PERSON where First_NAME = :firstName ORDER BY USER_NAME ASC")
	List<Person> findPersonByFirstNameOrderByUserNameAsc(@Param("firstName") String firstname);
	
	@Query(value="SELECT * FROM PERSON p where p.Last_NAME = :lastName ORDER BY p.USER_NAME ASC")
	List<Person> findPersonByLastNameOrderByUserNameAsc(@Param("lastName") String lastname);
	
	//pelo propio nome do metodo o spring data ja consegue fazer a implemantação
	List<Person> findPersonByLastNameOrderByFirstNameAsc(String lastName);
}


