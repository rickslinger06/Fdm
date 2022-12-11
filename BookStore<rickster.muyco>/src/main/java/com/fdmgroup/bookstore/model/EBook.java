package com.fdmgroup.bookstore.model;

public class EBook extends Book{

	
	public EBook(int itemId, double price, String title, String author, BookGenre bookGenre) {
		super(itemId, price, title, author, bookGenre);
		
	}

	private double sizeMegaBytes;

	
	public double getSizeMegaBytes() {
		return sizeMegaBytes;
	}

	public void setSizeMegaBytes(double sizeMegaBytes) {
		this.sizeMegaBytes = sizeMegaBytes;
	}
	
	
	
}
