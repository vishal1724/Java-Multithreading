package com.example.demo;

import com.example.demo.notification.NotificationService;

public class OrderService {
    
    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification; 
    }

    void placeOrder() {
        System.out.println("Order Placed.");
        notification.sendnotification();
    }
}
