package com.niko.library.service;

import org.springframework.stereotype.Service;

import com.niko.library.model.Book;

@Service
public class LibraryService {

	private final Book book;
	private final NotificationService notificationService;
	
	public LibraryService(Book book, NotificationService notificationService) {
		this.book = book;
		this.notificationService = notificationService;
		
        System.out.println("LibraryService initialized with book: " + book.getTitle());
	}
	
	public void borrowBook() {
		System.out.println("Borrowing book: " + book.getTitle());
	}
}
