package com.franciscocalaca.exemplo.springboot;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "persons")
public interface PersonDao extends PagingAndSortingRepository<Person, Integer>{

}
