package com.kiran.jenkinsdemo.jenkinsdemo.model;

public interface iOrder {
    int orderId = 0;
    int product = 0;
    void createOrder();
    void amendOrder(int orderId,int product);
 }
