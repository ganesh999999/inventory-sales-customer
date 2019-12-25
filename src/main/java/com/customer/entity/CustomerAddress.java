package com.customer.entity;

import java.util.Optional;

public class CustomerAddress {
	private Customer customer;
	private Address address;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerAddress [customer=" + customer + ", address=" + address + "]";
	}
}
