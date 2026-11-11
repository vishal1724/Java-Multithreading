package com.example.demo;

public class OrderService {
    
    private final PaymentService paymentService;

    // Constructor Injection
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void placeOrder() {
        System.out.println("Placing Order....");
        paymentService.pay();
        System.out.println("Order is Placed");
    }
}
