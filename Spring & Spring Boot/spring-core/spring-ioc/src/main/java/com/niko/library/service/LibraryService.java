package com.niko.library.service;

import com.niko.library.model.Book;

public class LibraryService {

	private final Book book;
	private final NotificationService notificationService;
	
	 // constructor injection: container automatically provides Book + NotificationService
	public LibraryService(Book book, NotificationService notificationService) {
		this.book = book;
		this.notificationService = notificationService;
		
        System.out.println("LibraryService initialized with book: " + book.getTitle());
	}
	
	public void borrowBook() {
		// container created NotificationService lazily if needed
		notificationService.sendNotification("Borrowing book: " + book.getTitle());
		
		System.out.println("Borrowing book: " + book.getTitle());
	}
}
