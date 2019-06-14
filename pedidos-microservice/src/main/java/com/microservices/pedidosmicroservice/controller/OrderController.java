package com.microservices.pedidosmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.pedidosmicroservice.domain.Order;
import com.microservices.pedidosmicroservice.service.OrderService;

@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Order> save(@RequestBody  Order order){
        return ResponseEntity.ok(orderService.save(order));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(orderService.findById(id).get());
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Order>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @RequestMapping(value = "/{id}/status", method = RequestMethod.GET)
    public ResponseEntity<?> checkStatus(@PathVariable("id") Integer id){
        return ResponseEntity.ok(orderService.checkStatus( id ));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        orderService.delete(id);
        return ResponseEntity.ok().build();
    }
}

