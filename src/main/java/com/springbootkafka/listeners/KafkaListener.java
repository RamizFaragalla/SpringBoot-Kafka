package com.springbootkafka.listeners;

import com.springbootkafka.config.KafkaTopicConfig;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = KafkaTopicConfig.TOPIC_NAME,
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
