package com.github.pedroluiznogueira.microservices.productservice.model;

import java.math.BigDecimal;

public class CouponDto {

    private BigDecimal discount;

    public CouponDto() {
    }

    public CouponDto(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
