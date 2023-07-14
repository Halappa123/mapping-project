package com.example.controller;

import org.springframework.aop.support.Pointcuts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController()
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/saveproduct")
	public ResponseEntity<Customer> saveProduct(@RequestBody Customer customer){
		return new  ResponseEntity(customerService.saveProduct(customer),HttpStatus.OK);
		
	}

}
