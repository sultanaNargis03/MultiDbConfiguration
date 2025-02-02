package com.telusko;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.model.customer.Customer;
import com.telusko.model.product.Product;
import com.telusko.repo.customer.ICustomer;
import com.telusko.repo.product.IProduct;

@SpringBootApplication
public class SpringBootMultiDbApplication implements CommandLineRunner 
{
	@Autowired
	private IProduct repo1;
	
	@Autowired
	private ICustomer repo2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultiDbApplication.class, args);
	}
	@Override
	public void  run(String... args)
	{
		repo1.saveAll(Arrays.asList(new Product("T01","Java"),
				new Product("T02","Spring"),
				new Product("T03","Hibernate")
				) );
		repo2.saveAll(Arrays.asList(new Customer("Nargis","nsultana123@telusko.com"),
				new Customer("Tamim","sktamim123@telusko.com")
				) );
	}
}
