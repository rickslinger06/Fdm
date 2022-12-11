package com.fdmgroup.bookstore.model;

public class AudioBook extends Book {
	
	public AudioBook(int itemId, double price, String title, String author, BookGenre bookGenre) {
		super(itemId, price, title, author, bookGenre);
		// TODO Auto-generated constructor stub
	}

	private int timeLengthSeconds;

	

	public int getTimeLengthSeconds() {
		return timeLengthSeconds;
	}

	public void setTimeLengthSeconds(int timeLengthSeconds) {
		this.timeLengthSeconds = timeLengthSeconds;
	}

	

}
