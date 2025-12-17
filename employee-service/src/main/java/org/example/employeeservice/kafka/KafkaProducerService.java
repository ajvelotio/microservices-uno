package org.example.employeeservice.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {

    private static final String TOPIC = "employee.created";

    private final KafkaTemplate<String, EmployeeCreatedEvent> kafkaTemplate;

    public KafkaProducerService(
            KafkaTemplate<String, EmployeeCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Publishes EmployeeCreatedEvent to Kafka
     * Key = employeeId (guarantees ordering per employee)
     */
    public void publish(EmployeeCreatedEvent event) {
        kafkaTemplate.send(
                TOPIC,
                event.getEmployeeId(), // key
                event
        );
    }
}