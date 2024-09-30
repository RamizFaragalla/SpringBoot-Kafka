package com.springbootkafka.listeners;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "demo-topic",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
