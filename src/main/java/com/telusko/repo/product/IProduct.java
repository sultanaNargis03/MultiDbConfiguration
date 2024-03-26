package com.telusko.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.product.Product;

public interface IProduct extends JpaRepository<Product, Integer> {

}
