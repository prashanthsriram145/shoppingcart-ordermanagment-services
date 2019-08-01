package com.visa.shoppingcart.orders.controllers;

import com.visa.shoppingcart.customer.customer.entities.Customer;
import com.visa.shoppingcart.customer.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-services/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    @ResponseBody
    public List<Customer> getAllCustomers(){
        List<Customer> customers = customerService.getAllCustomers();
        return customers;
    }

    @PostMapping(path="/addCustomer", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public boolean addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

}
