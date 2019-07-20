package com.ancyxing.designpatterns.prototypepatterns.usepatterns;

/**
 * @author yangxing
 * @date 2019/7/20
 */
public class PersonalOrder implements OrderApi {
    private String customerName;
    private int orderProductNum;
    private String productId;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public OrderApi cloneOrder() {
        // 创建一个新的对象并把本实例的数据复制过去
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setCustomerName(this.customerName);
        personalOrder.setProductId(this.productId);
        personalOrder.setOrderProductNum(this.orderProductNum);
        return personalOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", orderProductNum=" + orderProductNum +
                ", productId='" + productId + '\'' +
                '}';
    }
}
