package com.conquer.conquerbackend.service;

import com.conquer.conquerbackend.entity.Employee;
import com.conquer.conquerbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return employeeRepository.findAll();
    }
}
