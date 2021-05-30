package com.kiran.jenkinsdemo.jenkinsdemo.model;

public class order implements iOrder {
    @Override
    public void createOrder() {
        System.out.println("Method Implemented");
    }

    @Override
    public void amendOrder(int orderId, int product) {
        System.out.println("amendOrderImplemented");

    }
}
