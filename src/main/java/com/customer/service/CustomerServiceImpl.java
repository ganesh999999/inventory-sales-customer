package com.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createCustomer(Customer customer) {
		customerRepository.saveAndFlush(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(String customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

}
