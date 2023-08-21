package com.estudo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.demo.model.Product;

public interface productRepository extends JpaRepository<Product, Long>{

    Product findById(long id);
}