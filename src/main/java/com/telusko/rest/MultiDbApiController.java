package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.customer.Customer;
import com.telusko.model.product.Product;
import com.telusko.repo.customer.ICustomer;
import com.telusko.repo.product.IProduct;


@RestController
@RequestMapping("/api")
public class MultiDbApiController 
{
	@Autowired
	private IProduct repo1;
	
	@Autowired
	private ICustomer repo2;
	
	@GetMapping("/getcustomers")
	public List<Customer> getAllCustomers()
	{
		return repo2.findAll();
	}
	@GetMapping("/getproducts")
	public List<Product> getAllProducts()
	{
		return repo1.findAll();
	}
}
