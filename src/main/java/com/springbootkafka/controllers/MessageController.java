package com.springbootkafka.controllers;

import com.springbootkafka.config.KafkaTopicConfig;
import com.springbootkafka.dtos.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<Void> publish(@RequestBody MessageDto messageDto) {
        kafkaTemplate.send(KafkaTopicConfig.TOPIC_NAME, messageDto.message());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
