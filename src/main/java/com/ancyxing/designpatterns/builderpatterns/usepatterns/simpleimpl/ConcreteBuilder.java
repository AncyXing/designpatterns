package com.ancyxing.designpatterns.builderpatterns.usepatterns.simpleimpl;

import java.math.BigDecimal;

/**
 * 具体的对象生成器
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildProductId(String productId) {
        this.product.setProductId(productId);
    }

    @Override
    public void buildProductName(String productName) {
        this.product.setProductName(productName);
    }

    @Override
    public void buildProductPrice(BigDecimal price) {
        this.product.setPrice(price);
    }

    public Product getProduct() {
        return product;
    }
}
