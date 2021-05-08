package com.classpath.kafkaproducerconsumer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private static final String TOPIC = "anish-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishOrder(String message){
        this.kafkaTemplate.send(TOPIC, message);
    }

}
