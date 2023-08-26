package com.estudo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estudo.demo.model.Product;
import com.estudo.demo.repository.productRepository;

import jakarta.validation.Valid;
@Service
public class productService {
    private productRepository repository;

    public productService(productRepository repository) {
        this.repository = repository;
    }
    
    public List<Product> showProducts(){
        List<Product> list = repository.findAll();
        return list;
    }

    public Product showSpecificProduct(long id){
        Product newProduct = repository.findById(id);
        return newProduct;
    }

    public Product putProduct(@Valid Product product){
        Product newProduct = repository.save(product);
        return newProduct;
    }

    public Product postProduct(@Valid Product product){
        Product pProduct = repository.save(product);
        return pProduct;
    }

    public boolean deleteProduct(long id){
        repository.deleteById(id);
        return true;
    }

}
