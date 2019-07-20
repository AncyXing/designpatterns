package com.ancyxing.designpatterns.prototypepatterns.usepatterns;

/**
 * @author yangxing
 * @date 2019/7/20
 */
public interface OrderApi {
    /**
     * 获取订单的产品数量
     * @return 订单产品数量
     */
    int getOrderProductNum();

    /**
     * 设置订单的产品数量
     * @param num 产品数量
     */
    void setOrderProductNum(int num);

    /**
     * 复制自身实例属性的方法
     * @return 拥有与本实例属性值相同的新对象
     */
    OrderApi cloneOrder();
}
