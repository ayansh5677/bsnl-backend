package com.conquer.conquerbackend.controller;

import com.conquer.conquerbackend.entity.FtthCustomer;
import com.conquer.conquerbackend.entity.FtthPlan;
import com.conquer.conquerbackend.repository.FtthPlansRepository;
import com.conquer.conquerbackend.service.FtthCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class FtthCustomerController {

    @Autowired
    private FtthCustomerService service;

    @Autowired
    private FtthPlansRepository plansRepository;

    @PostMapping("/addCustomer")
    public FtthCustomer addProduct(@RequestBody FtthCustomer customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping("/customers")
    public List<FtthCustomer> getAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/fiberPlans")
    public List<FtthPlan> getAllFiberPlans() {
        return plansRepository.findAll();
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public List<FtthCustomer> deleteCustomer(@PathVariable int id) {
        return service.deleteCustomer(id);
    }

    @PutMapping("/update")
    public FtthCustomer updateCustomer(@RequestBody FtthCustomer customer) {
        return service.updateCustomer(customer);
    }

}
