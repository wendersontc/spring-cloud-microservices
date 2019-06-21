package com.microservices.kafkamicroservice.controller;

import java.util.Date;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/kafka")
public class KafkaController {
	
	private static final Logger LOG = Logger.getLogger(KafkaController.class.getName());
	
	@GetMapping("/getName")
	public String getName(@RequestParam("name") String name) {
		LOG.info("RequestParam : " + name);
		return name + " -- " + new Date();
	}
	
	@GetMapping("/exception")
	public void trowException() {
		try {
			throw new Exception();
		}catch (Exception e) {
			LOG.info("Exception: " + e);
		}
	}

}
