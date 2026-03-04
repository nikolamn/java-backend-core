package com.niko.library.service;

public class NotificationService {

    public NotificationService() {
        // prototype bean: container creates a new instance every time
        //  if @Lazy, this is only called when first requested
        System.out.println("NotificationService instance created");
    }
	
	public void sendNotification(String message) {
		System.out.println("Notification: " + message);
	}
}
