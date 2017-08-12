package com.franciscocalaca.exemplo.springboot.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.franciscocalaca.exemplo.springboot.model.OrderClient;

@RepositoryRestResource(collectionResourceRel = "order", path = "orders")
public interface OrderDao extends PagingAndSortingRepository<OrderClient, Integer>{

}
