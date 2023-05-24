package com.testcontainers.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CustomerService {

    public List<Customer> getAll() {
        return Customer.listAll();
    }

    public Customer create(Customer customer) {
        customer.persist();
        return customer;
    }
}
