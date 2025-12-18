package org.example.departmentservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("employee-service")
public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    public String getEmployeeByDepartmentId(@PathVariable Long id);
}
