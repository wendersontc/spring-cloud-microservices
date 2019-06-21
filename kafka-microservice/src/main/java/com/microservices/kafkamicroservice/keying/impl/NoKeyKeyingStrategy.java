package com.microservices.kafkamicroservice.keying.impl;

import com.microservices.kafkamicroservice.keying.KeyingStrategy;

public class NoKeyKeyingStrategy implements KeyingStrategy<Object> {

    @Override
    public byte[] createKey(Object e) {
        return null;
    }
}
