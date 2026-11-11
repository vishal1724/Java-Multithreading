package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.notification.EmailService;
import com.example.demo.notification.NotificationService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		NotificationService notification = new EmailService(); 
    	// NotificationService notification = new SMSService(); 
    	// NotificationService notification = new PopUpNotificationService(); 

		OrderService order = new OrderService(notification);
		order.placeOrder();
	}


}