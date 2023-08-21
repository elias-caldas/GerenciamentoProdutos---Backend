package com.estudo.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.demo.model.Product;
import com.estudo.demo.repository.productRepository;

//Controller
//receber requisições HTTP
@RestController
@RequestMapping(value = "/demo")
public class productResource {
    
    @Autowired
    productRepository pr;

    @GetMapping("/products")
    public List<Product> ProductList(){
        return pr.findAll();
    }

    @GetMapping("/products/{id}")
    public Product SpecificProduct(@PathVariable(value="id") long id){
        return pr.findById(id);
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return pr.save(product);
    }

    @DeleteMapping("/products")

    public void deleteProduct(@RequestBody Product product){
        pr.delete(product);
    }

    @PutMapping("/products")
    public void putProduct(@RequestBody Product product){
        pr.save(product);
    }
   
}
