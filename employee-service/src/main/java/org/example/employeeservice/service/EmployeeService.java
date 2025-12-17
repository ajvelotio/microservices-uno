package org.example.employeeservice.service;

import org.example.employeeservice.kafka.KafkaProducerService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class EmployeeService {

    private final KafkaProducerService kafkaProducerService;

    public EmployeeService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    /**
     * Business operation.
     * In real systems this would also persist to DB.
     */
    public void createEmployee(String employeeId) {

        // Build domain event
        EmployeeCreatedEvent event = new EmployeeCreatedEvent();
        event.setEventId(UUID.randomUUID().toString());
        event.setEmployeeId(employeeId);
        event.setCreatedAt(Instant.now());

        // Publish event
        kafkaProducerService.publish(event);
    }
}