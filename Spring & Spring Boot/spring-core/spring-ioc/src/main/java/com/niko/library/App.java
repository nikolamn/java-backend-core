package com.niko.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niko.library.config.AppConfig;
import com.niko.library.service.LibraryService;

public class App {

	public static void main(String[] args) {
		// App just retrieves beans, container handles everything else
        // container bootstraps AppConfig, creates and wires all beans automatically
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // container injects dependencies for LibraryService automatically
		LibraryService libraryService = context.getBean(LibraryService.class);
		libraryService.borrowBook(); // uses injected Book + NotificationService
		
        // prototype beans: each getBean call returns a new instance, managed by container
        System.out.println("Requesting NotificationService again...");
        System.out.println(context.getBean("notificationService"));
        System.out.println(context.getBean("notificationService"));
	}
}
