package org.example.employeeservice.kafka.config;

import org.example.employeeservice.kafka.config.event.MessageEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerService {

    private static final String TOPIC = "employee.created";

    /*@KafkaListener(
            topics = TOPIC,
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void consume(MessageEvent event,
                        Acknowledgment acknowledgment) {

        try {
            // Business logic (keep minimal)
            System.out.println(
                    "Consumed employee event. employeeId=" + event.getId()
            );

            // Manually commit offset after successful processing
            acknowledgment.acknowledge();

        } catch (Exception ex) {
            // Do NOT acknowledge on failure
            // Message will be reprocessed
            System.err.println("Error processing message: " + ex.getMessage());
            throw ex;
        }
    }*/
}

