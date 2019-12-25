package com.customer.service;

import java.util.List;
import java.util.Optional;

import com.customer.entity.Customer;

public interface CustomerService {
public void createCustomer(Customer customer);
public Optional<Customer> getCustomerById(String customerId);
public List<Customer> getCustomers();
}
