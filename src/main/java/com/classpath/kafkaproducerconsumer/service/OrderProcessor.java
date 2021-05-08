package com.classpath.kafkaproducerconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessor {

    @KafkaListener(topics = "anish-topic", groupId = "app_id")
    public void processOrder(String message){
        System.out.println("Processing the orders"+ message);
    }
}
