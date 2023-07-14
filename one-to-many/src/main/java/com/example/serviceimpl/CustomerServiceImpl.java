package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.entity.ResultEntiry;
import com.example.repository.CustomerRepository;
import com.example.repository.ProductRepository;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ResultEntiry saveProduct(Customer customer) {
	 
		Customer saveproduct=customerRepository.save(customer);
		
		return new ResultEntiry("All product data saved", saveproduct);
	
	}

}
