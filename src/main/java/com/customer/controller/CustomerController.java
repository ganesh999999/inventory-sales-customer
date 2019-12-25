package com.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Address;
import com.customer.entity.Customer;
import com.customer.entity.CustomerAddress;
import com.customer.feign.AddressFeignClient;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AddressFeignClient addressFeignClient;

	@PostMapping
	public void createCustomer(@RequestBody CustomerAddress customerAddress) {
		Customer customer = customerAddress.getCustomer();
		Address address = customerAddress.getAddress();
		customerService.createCustomer(customer);
		addressFeignClient.createAddress(address);
		System.out.println("customer and addres has been created ");
	}

	@GetMapping("/{customerId}")
	public CustomerAddress getCustomerById(@PathVariable String customerId) {
		Customer customer = customerService.getCustomerById(customerId).get();
		Address address = addressFeignClient.getAddressById(customerId).get();
		CustomerAddress ca = new CustomerAddress();
		ca.setCustomer(customer);
		ca.setAddress(address);
		return ca;
	}

	@GetMapping
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
	}

//when primary and foreign keys are different in address table
	@GetMapping("/{customerId}/{addressId}")
	public CustomerAddress getCustomerById(@PathVariable String customerId, @PathVariable String addressId) {
		Optional<Customer> customer = customerService.getCustomerById(customerId);
		Optional<Address> address = addressFeignClient.getAddressById(addressId);
		CustomerAddress ca = new CustomerAddress();
		ca.setCustomer(customer.get());
		ca.setAddress(address.get());
		return ca;
	}

}
