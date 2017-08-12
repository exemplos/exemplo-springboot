package com.franciscocalaca.exemplo.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.franciscocalaca.exemplo.springboot.model.Client;

@RepositoryRestResource(collectionResourceRel = "client", path = "clients")
public interface ClientDao extends PagingAndSortingRepository<Client, Integer>{

}
