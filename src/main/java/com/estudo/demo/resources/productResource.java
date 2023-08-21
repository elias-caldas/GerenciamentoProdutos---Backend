package com.estudo.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@CrossOrigin("*")
@RequestMapping(value = "/demo")
public class productResource {
    
    @Autowired
    productRepository pr;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> ProductList(){
        List<Product> list = (List<Product>)  pr.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> SpecificProduct(@PathVariable(value="id") long id){
        Product specificProduct_ = pr.findById(id);
        return ResponseEntity.status(200).body(specificProduct_);
    }

    @PostMapping("/products")
    public ResponseEntity<Product>  saveProduct(@RequestBody Product product){
        Product product_ = pr.save(product);
        return ResponseEntity.status(201).body(product_);
    }

    @DeleteMapping("/products/{id}")

    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        pr.deleteById(id);
        return ResponseEntity.status(204).build();

    }

    @PutMapping("/products")
    public ResponseEntity<Product> putProduct (@RequestBody Product product){
        Product newProduct = pr.save(product);
        return ResponseEntity.status(201).body(newProduct);
    }
   
}
