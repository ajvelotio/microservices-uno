package org.example.employeeservice.kafka.config;

import org.example.employeeservice.kafka.config.event.MessageEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {

    private static final String TOPIC = "employee.created";

    /*private final KafkaTemplate<String, MessageEvent> kafkaTemplate;

    public KafkaProducerService(
            KafkaTemplate<String, MessageEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    *//**
     * Publishes EmployeeCreatedEvent to Kafka
     * Key = employeeId (guarantees ordering per employee)
     *//*
    public void publish(MessageEvent event) {
        kafkaTemplate.send(
                TOPIC, event.getId(), // key
                event
        );
    }*/
}