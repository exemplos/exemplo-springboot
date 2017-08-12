package com.franciscocalaca.exemplo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.franciscocalaca.exemplo.springboot.model.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "persons")
public interface PersonDao extends PagingAndSortingRepository<Person, Integer>{

	@Query("select p from Person p where upper(p.name) like upper(:name)")
	List<Person> listByName(@Param("name") String name);
	
}
