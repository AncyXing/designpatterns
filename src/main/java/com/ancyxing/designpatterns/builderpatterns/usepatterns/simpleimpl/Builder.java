package com.ancyxing.designpatterns.builderpatterns.usepatterns.simpleimpl;

import java.math.BigDecimal;

/**
 * 产品生成器接口
 */
public interface Builder {
    /**
     * 构建产品id
     */
    void buildProductId(String productId);
    /**
     * 构建产品name
     */
    void buildProductName(String productName);
    /**
     * 构建产品price
     */
    void buildProductPrice(BigDecimal price);
}
