package com.patterns.structuralPattern.decorator;

public class BookDecorator implements Book{
	private Book book;
	public BookDecorator(Book book) {
		this.book = book;
	}
	@Override
	public void borrowBook() {
		book.borrowBook();
	}
}
