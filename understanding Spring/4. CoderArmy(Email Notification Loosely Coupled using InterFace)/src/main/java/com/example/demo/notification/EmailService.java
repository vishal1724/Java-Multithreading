package com.example.demo.notification;

public class EmailService implements NotificationService {
    
    @Override  
    public void sendnotification() {
        System.out.println("Email Notification Sent!");
    }
}
