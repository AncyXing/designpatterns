package com.ancyxing.designpatterns.prototypepatterns.usepatterns;

import java.util.List;

/**
 * @author yangxing
 * @date 2019/7/20
 */
public class Client {

    public static void main(String[] args) {
        // 构建需要复制的对象
        PersonalOrder order = new PersonalOrder();
        order.setOrderProductNum(5000);
        order.setProductId("100011");
        String customerName = "test";
        order.setCustomerName(customerName);
        // 进行具体的业务处理，构建新的订单对象
        OrderBusiness orderBusiness = new OrderBusiness();
        List<OrderApi> orderApiList1 = orderBusiness.saveOrder(order);
        order.setOrderProductNum(5000);
        String customerName1 = "test1";
        order.setCustomerName(customerName1);
        List<OrderApi> orderApiList2 = orderBusiness.saveOrder(order);
        // 从打印结果可以看出String类型的变量在clone时是值传递
        orderApiList1.forEach(System.out::println);
        System.out.println("=============================");
        orderApiList2.forEach(System.out::println);

    }
}
