package com.microservices.kafkamicroservice.delivery;

public interface FailedDeliveryCallback<E> {
    void onFailedDelivery(E evt, Throwable throwable);
}
