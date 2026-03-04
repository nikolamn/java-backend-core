package com.niko.library.model;

public class BookReference {
	
	// circular dependency reference 
	private BookReference next;
	 

	public BookReference() {
	}

	public BookReference(BookReference next) {
		this.next = next;
	}

	public BookReference getNext() {
		return next;
	}

	public void setNext(BookReference next) {
		this.next = next;
	}
}
