package com.example.demo.notification;

public class SMSService implements NotificationService {
    
    @Override 
    public void sendnotification() {
        System.out.println("SMS Notification Sent!");
    }
}
