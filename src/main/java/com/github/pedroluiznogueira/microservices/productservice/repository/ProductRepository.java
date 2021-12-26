package com.github.pedroluiznogueira.microservices.productservice.repository;

import com.github.pedroluiznogueira.microservices.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
