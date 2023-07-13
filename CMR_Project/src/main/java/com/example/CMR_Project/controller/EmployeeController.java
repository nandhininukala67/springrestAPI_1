package com.example.CMR_Project.controller;
import ch.qos.logback.core.model.Model;
import com.example.CMR_Project.entity.Employee;
import com.example.CMR_Project.ripository.EmployeeRepository;
import com.example.CMR_Project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
@Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {

        return this.employeeRepository.save(employee);
    }


}
