package com.fdmgroup.bookstore.model;

public class AudioBook {
	
	int timeLengthSeconds;

	public AudioBook(int timeLengthSeconds) {
		super();
		this.timeLengthSeconds = timeLengthSeconds;
	}

	public int getTimeLengthSeconds() {
		return timeLengthSeconds;
	}

	public void setTimeLengthSeconds(int timeLengthSeconds) {
		this.timeLengthSeconds = timeLengthSeconds;
	}
	
	

}
