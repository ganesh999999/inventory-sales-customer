package com.customer.feign;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.entity.Address;

@FeignClient("inventory-sales-address")
public interface AddressFeignClient {
	@GetMapping("address/{addressId}")
	public Optional<Address> getAddressById(@PathVariable String addressId);
	@PostMapping("/address")
	public void createAddress(@RequestBody Address address);
	
}