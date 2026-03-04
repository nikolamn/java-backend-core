package com.niko.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.niko.library.model.Author;
import com.niko.library.model.Book;
import com.niko.library.model.BookReference;
import com.niko.library.service.LibraryService;
import com.niko.library.service.NotificationService;

// Conf container knows where to look for beans
@Configuration // automatic bean handling by Spring
public class AppConfig {

	// cont creates and manages instances
	@Bean // container creates Author as singleton (default)
	public Author author() {
		return new Author("Leo Tolstoy"); // simple singleton bean
	}

	@Bean // container injects Author automatically via constructor
	public Book book(Author author) {
		return new Book("War and Peace", author); // constructor injection
	}

	@Bean // container injects Book + NotificationService automatically
	public LibraryService libraryService(Book book, NotificationService notificationService) {
		return new LibraryService(book, notificationService); // constructor injection
	}

	// singleton - container creates one instance at startup (default)
	// prototype - container creates a new instance every time you call getBean()
	@Bean
	@Scope("prototype") // container new instance each time // controls new instance creation
	@Lazy // only create when first requested // container delays bean creation
	public NotificationService notificationService() {
		return new NotificationService();
	}

	// circular dependency example
	// constructor-based
//	@Bean
//	public BookReference bookRefA(BookReference bookRefB) {
//		return new BookReference(bookRefB);
//	}
//
//	@Bean
//	public BookReference bookRefB(BookReference bookRefA) {
//		return new BookReference(bookRefA);
//	}

	// setter-based dependency
	@Bean
	public BookReference bookRefA() {
		return new BookReference();
	}

	@Bean
	public BookReference bookRefB() {
		return new BookReference();
	}

	@Bean
	public BookReference wireBookReferences(BookReference bookRefA, BookReference bookRefB) {
		bookRefA.setNext(bookRefB); // rA -> rB
		bookRefB.setNext(bookRefA); // rB -> rA, circular
		return bookRefA;
	}
}
