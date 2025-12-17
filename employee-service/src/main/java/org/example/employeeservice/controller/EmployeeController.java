package org.example.employeeservice.controller;

import org.example.employeeservice.kafka.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final KafkaProducerService producerService;

    public EmployeeController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeCreatedEvent event) {
        producerService.publish(event);
        return ResponseEntity.ok("Employee event published");
    }
}

