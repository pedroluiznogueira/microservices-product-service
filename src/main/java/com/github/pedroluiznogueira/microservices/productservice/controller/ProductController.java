package com.github.pedroluiznogueira.microservices.productservice.controller;

import com.github.pedroluiznogueira.microservices.productservice.model.CouponDto;
import com.github.pedroluiznogueira.microservices.productservice.model.Product;
import com.github.pedroluiznogueira.microservices.productservice.proxy.CouponProxy;
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

    @Autowired
    private CouponProxy couponProxy;

    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        CouponDto coupon = couponProxy.retrieveDiscount(product.getCouponCode());
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));

        return productRepository.save(product);
    }
}
