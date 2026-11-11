package com.example.demo;

import org.springframework.stereotype.Service;

@Service 
public class UPIPayment implements PaymentService {
    
    @Override 
    public void pay() {
        System.out.println("Payment Processed using UPI");
    }
}
