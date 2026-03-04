package com.niko.library.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // demonstrates prototype scope
@Lazy                 // demonstrates lazy initialization
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
