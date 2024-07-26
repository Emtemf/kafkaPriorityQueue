package com.emt.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerDemo {
    @KafkaListener(topics = "test")
    public void userListener(ConsumerRecord<?, ?> record) {
        System.out.println("receive success" +  record.topic());
    }
}
