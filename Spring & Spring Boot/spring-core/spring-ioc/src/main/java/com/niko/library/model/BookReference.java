package com.niko.library.model;

public class BookReference {

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

	@Override
	public String toString() {
		return "BookReference@" + hashCode();
	}
}
