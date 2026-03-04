package com.niko.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.niko.library.model.Author;
import com.niko.library.model.Book;
import com.niko.library.model.BookReference;
import com.niko.library.service.NotificationService;

@Configuration
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
	
    // prototype + lazy bean
    @Bean
    @Scope("prototype")
    @Lazy
    public NotificationService notificationService() {
        return new NotificationService();
    }
    
    @Bean
    public BookReference bookRefA() { return new BookReference(); }

    @Bean
    public BookReference bookRefB() { return new BookReference(); }
    
    // constructor-base circular dependency
//    @Bean
//    public BookReference bookRefA(BookReference bookRefB) {
//        return new BookReference(bookRefB);  // A depends on B
//    }
//
//    @Bean
//    public BookReference bookRefB(BookReference bookRefA) {
//        return new BookReference(bookRefA); // B depends on A -> circular
//    }
}
