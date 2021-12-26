package com.github.pedroluiznogueira.microservices.productservice.proxy;

import com.github.pedroluiznogueira.microservices.productservice.model.CouponDto;
import com.github.pedroluiznogueira.microservices.productservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080/coupons/", name = "coupons")
public interface CouponProxy {

    @GetMapping("find/{code}")
    CouponDto retrieveDiscount(@PathVariable String code);
}
