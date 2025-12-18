package org.example.employeeservice.controller;

import com.netflix.discovery.converters.Auto;
import org.example.employeeservice.kafka.config.KafkaProducerService;
import org.example.employeeservice.kafka.config.event.MessageEvent;
import org.example.employeeservice.model.Employee;
import org.example.employeeservice.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    /*private final KafkaProducerService producerService;

    public EmployeeController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody MessageEvent event) {
        producerService.publish(event);
        return ResponseEntity.ok("Employee event published");
    }*/

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable Long id) {

        logger.info("Inside Employee Service. Fetching employee with id: " + id);
        return "Employee id : " + id + " from Employee Service";
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/{departmentId}")
    public Employee getByDepartmentId(@PathVariable Long departmentId) {
        return employeeRepository.findById(departmentId).orElse(null);
    }
}

