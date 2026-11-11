package com.example.demo;

public class OrderService {
    
    PaymentService paymentService = new PaymentService();
    
    void placeOrder() {
        System.out.println("Placing Order....");
        paymentService.pay();
        System.out.println("Order is Placed");
    }
}
