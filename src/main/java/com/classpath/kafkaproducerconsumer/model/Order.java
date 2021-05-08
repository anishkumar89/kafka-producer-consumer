package com.classpath.kafkaproducerconsumer.model;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "orderId")
public class Order {

    private long orderId;
    private double price;
    private String customer;

}
