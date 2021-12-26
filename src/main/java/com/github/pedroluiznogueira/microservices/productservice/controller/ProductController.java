package com.github.pedroluiznogueira.microservices.productservice.controller;

import com.github.pedroluiznogueira.microservices.productservice.model.Product;
import com.github.pedroluiznogueira.microservices.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
