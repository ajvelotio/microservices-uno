package org.example.employeeservice.kafka.config.service;

import org.example.employeeservice.kafka.config.KafkaProducerService;
import org.example.employeeservice.kafka.config.event.MessageEvent;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class EmployeeService {

    /*private final KafkaProducerService kafkaProducerService;

    public EmployeeService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    *//**
     * Business operation.
     * In real systems this would also persist to DB.
     *//*
    public void createEmployee(String employeeId) {

        // Build domain event
        MessageEvent event = new MessageEvent();
        event.setId(UUID.randomUUID().toString());
        event.setId(employeeId);
//        event.setMessage(Instant.now());
        event.setMessage("Employee created at " + Instant.now().toString());

        // Publish event
        kafkaProducerService.publish(event);
    }*/
}