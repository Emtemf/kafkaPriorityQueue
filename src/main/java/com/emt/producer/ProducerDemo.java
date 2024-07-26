package com.emt.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerDemo {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/sendDemoMessage")
    public String sendDemoMessage() {
        kafkaTemplate.send("test", "test send ok");
        return "success";
    }
}
