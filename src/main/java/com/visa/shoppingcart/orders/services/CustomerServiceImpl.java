package com.visa.shoppingcart.orders.services;

import com.visa.shoppingcart.customer.customer.dao.CustomerRepository;
import com.visa.shoppingcart.customer.customer.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public boolean addCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer != null;
    }
}
