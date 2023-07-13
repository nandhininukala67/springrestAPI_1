package com.example.CMR_Project.service;

import com.example.CMR_Project.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
