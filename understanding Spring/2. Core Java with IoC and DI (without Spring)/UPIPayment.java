package com.example.demo;

public class UPIPayment implements PaymentService {
    
    @Override 
    public void pay() {
        System.out.println("Payment Processed using UPI");
    }
}
