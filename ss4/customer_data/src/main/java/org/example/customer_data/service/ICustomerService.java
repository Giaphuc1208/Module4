package org.example.customer_data.service;

import org.example.customer_data.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);

    Object findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
