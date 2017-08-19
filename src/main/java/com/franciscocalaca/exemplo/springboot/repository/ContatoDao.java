package com.franciscocalaca.exemplo.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.franciscocalaca.exemplo.springboot.model.Contato;

@RepositoryRestResource(collectionResourceRel = "dao.contato", path = "dao.contatos")
public interface ContatoDao extends PagingAndSortingRepository<Contato, Integer>{

}
