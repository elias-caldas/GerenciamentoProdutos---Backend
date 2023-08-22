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
import com.estudo.demo.service.productService;

//Controller
//receber requisições HTTP
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/demo")
public class productResource {
    
    @Autowired
    productRepository pr;

    public productService pService;

    public productResource(productService pService){
        this.pService = pService;
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> ProductList(){
        return ResponseEntity.status(200).body(pService.showProducts());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> SpecificProduct(@PathVariable(value="id") long id){
        return ResponseEntity.status(200).body(pService.showSpecificProduct(id));
    }

    @PostMapping("/products")
    public ResponseEntity<Product>  saveProduct(@RequestBody Product product){
        return ResponseEntity.status(201).body(pService.postProduct(product));
    }

    @DeleteMapping("/products/{id}")

    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        pService.deleteProduct(id);
        return ResponseEntity.status(204).build();

    }

    @PutMapping("/products")
    public ResponseEntity<Product> putProduct (@RequestBody Product product){
        return ResponseEntity.status(201).body(pService.putProduct(product));
    }
   
}
