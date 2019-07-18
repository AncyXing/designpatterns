package com.ancyxing.designpatterns.builderpatterns.baseimpl;

import java.math.BigDecimal;

/**
 * 文件主体内容
 * @author yangxing
 * @date 2019/7/17
 */
public class ExportDataModel {
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 销售价格
     */
    private BigDecimal price;
    /**
     * 销售数量
     */
    private Long amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
