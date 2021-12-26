package com.github.pedroluiznogueira.microservices.productservice.dto;

import java.math.BigDecimal;

public class Coupon {

    private Long Id;
    private String code;
    private BigDecimal discount;
    private String expDate;

    public Coupon() {
    }

    public Coupon(Long id, String code, BigDecimal discount, String expDate) {
        Id = id;
        this.code = code;
        this.discount = discount;
        this.expDate = expDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
