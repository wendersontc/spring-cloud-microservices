package com.microservices.pedidosmicroservice.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.microservices.pedidosmicroservice.domain.Order;
import com.microservices.pedidosmicroservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        order.setCode( UUID.randomUUID().toString() );
        return orderRepository.save(order);
    }

    public Optional<Order> findById(Integer id){
        return orderRepository.findById(id);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    public String checkStatus(Integer id){
        Order order = orderRepository.findById( id ).get();
        //return paymentClient.checkStatus( order.getCode() );
        return null;
    }

}
