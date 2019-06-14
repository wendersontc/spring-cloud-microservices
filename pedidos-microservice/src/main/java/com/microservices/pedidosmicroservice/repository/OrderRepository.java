package com.microservices.pedidosmicroservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservices.pedidosmicroservice.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
