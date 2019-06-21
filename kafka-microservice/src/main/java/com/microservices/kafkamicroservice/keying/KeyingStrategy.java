package com.microservices.kafkamicroservice.keying;

public interface KeyingStrategy<E> {
	
    byte[] createKey(E e);

}

