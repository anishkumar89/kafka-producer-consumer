package com.classpath.kafkaproducerconsumer.controller;

import com.classpath.kafkaproducerconsumer.model.Order;
import com.classpath.kafkaproducerconsumer.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public void postOrder(@RequestBody Order order){
        this.orderService.publishOrder(order.toString());
    }

}
