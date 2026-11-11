package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);


		OrderService orderService = new OrderService();
		orderService.placeOrder();
	}

}

// Normal Core Java (Without IOC and DI)
// Here Main creates orderService and orderService creates paymentService ****
// Code is Tightly Coupled