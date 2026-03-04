package com.niko.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.niko.library.model.BookReference;
import com.niko.library.service.LibraryService;
import com.niko.library.service.NotificationService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication // enables @Configuration, component scanning, and auto-config
public class App {
	
	private final LibraryService libraryService;
	private final ApplicationContext context;
	
	// constructor injection
	public App(LibraryService libraryService, ApplicationContext context) {
		this.libraryService = libraryService;
		this.context = context;
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@PostConstruct // runs after Spring ctx is fully initialized
	public void runDemo() {
		// librartService uses constructor injected Book + Notification Service
		libraryService.borrowBook();
		
		// prototype beans: each getBean call returns a new instance
        System.out.println("Requesting NotificationService again...");
        NotificationService ns1 = context.getBean(NotificationService.class);
        NotificationService ns2 = context.getBean(NotificationService.class);
        System.out.println(ns1);
        System.out.println(ns2);
        
        // setter-based circular dependency 
        BookReference a = context.getBean("bookRefA", BookReference.class);
        BookReference b = context.getBean("bookRefB", BookReference.class);
        a.setNext(b);
        b.setNext(a);
        
        System.out.println("BookReferenceA next: " + a.getNext());
        System.out.println("BookReferenceB next: " + b.getNext());
	}
}
