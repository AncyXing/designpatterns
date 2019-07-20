package com.ancyxing.designpatterns.prototypepatterns.usepatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxing
 * @date 2019/7/20
 */
public class OrderBusiness {

    public static final int THRESHOLD = 1000;

    public List<OrderApi> saveOrder(OrderApi order) {
        List<OrderApi> orders = new ArrayList<>();
        while (order.getOrderProductNum() > THRESHOLD) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum() - THRESHOLD);
            orders.add(newOrder);
        }
        return orders;
    }
}
