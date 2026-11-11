package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);


		// OrderService orderService = new OrderService();


		// Creating the dependency
		PaymentService paymentService = new UPIPayment();

		// Injecting the dependency
		OrderService orderService = new OrderService(paymentService);

		orderService.placeOrder();
	}

}

// Part 2: Core Java with IoC and DI (without Spring)
// Now let's implement the same example using an interface and Dependency Injection.
// We will manually manage the objects from the Main class. This demonstrates the IoC principle without using Spring.