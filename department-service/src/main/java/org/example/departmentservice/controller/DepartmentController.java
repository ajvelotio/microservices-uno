package org.example.departmentservice.controller;

import org.example.departmentservice.feign.EmployeeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    EmployeeClient employeeClient;


    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id) {
        logger.info("Fetching department for employee id: " + id);
        return "Employee service fetched successfully : " + employeeClient.getEmployeeByDepartmentId(id);
    }
}
