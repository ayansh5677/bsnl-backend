package com.conquer.conquerbackend.controller;

import com.conquer.conquerbackend.entity.Employee;
import com.conquer.conquerbackend.repository.EmployeeRepository;
import com.conquer.conquerbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee AddEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> findAllEmployees() {
        return employeeService.getEmployees();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public List<Employee> deleteCustomer(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
