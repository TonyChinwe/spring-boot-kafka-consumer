package com.phi.soft.springkafkaconsumerone.consumer;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@EnableKafka
public class MyKafkaConsumer {
    @KafkaListener(topics = "quickstart-events",groupId = "group_id")
    public void consume(String message){
        System.out.println("message "+message);
    }
}
