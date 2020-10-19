package com.conquer.conquerbackend.service;


import com.conquer.conquerbackend.entity.FtthCustomer;
import com.conquer.conquerbackend.repository.FtthCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FtthCustomerService {

    @Autowired
    private FtthCustomerRepository customerRepository;

    public FtthCustomer saveCustomer(FtthCustomer product) {
        return customerRepository.save(product);
    }

    public List<FtthCustomer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<FtthCustomer> deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return customerRepository.findAll();
    }

    public FtthCustomer updateCustomer(FtthCustomer customer) {
        FtthCustomer existingCustomer = customerRepository.findByLandLine(customer.getLandLine());
        existingCustomer.setName(customer.getName());
        existingCustomer.setLandLine(customer.getLandLine());
        existingCustomer.setPhoneNo(customer.getPhoneNo());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPlan(customer.getPlan());
        existingCustomer.setStartDate(customer.getStartDate());
        existingCustomer.setEndDate(customer.getEndDate());
        existingCustomer.setGender(customer.getGender());
        return customerRepository.save(existingCustomer);
    }
}
