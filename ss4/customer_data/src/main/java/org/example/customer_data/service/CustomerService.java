package org.example.customer_data.service;

import org.example.customer_data.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerService implements ICustomerService{
    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Phuc", "phuc@codegym.vn", "Da Nang"));
        customers.put(2, new Customer(2, "Hoi", "hoi@codegym.vn", "Quang Nam"));
        customers.put(3, new Customer(3, "Sy", "sy@codegym.vn", "Quang Nam"));
        customers.put(4, new Customer(4, "Cuong", "cuong@codegym.vn", "Da Nang"));
        customers.put(5, new Customer(5, "Nhat", "nhat@codegym.vn", "Phu Yen"));
        customers.put(6, new Customer(6, "Quang", "quang@codegym.vn", "Ha Tinh"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Object findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
