package com.ancyxing.designpatterns;

import java.math.BigDecimal;

/**
 * 负责管理整个构建过程
 */
public class Director {
    Builder builder;
    Director(Builder builder) {
        this.builder = builder;
    }

    public void constructBuilder(String productId, String productName, BigDecimal price) {
        this.builder.buildProductId(productId);
        this.builder.buildProductName(productName);
        this.builder.buildProductPrice(price);
    }
}
