package Model;

public class AudioBook extends Book {
	
	public int timeLengthSeconds;

	public AudioBook(int itemId, double price, String title, String author, BookGenre bookGenre,
			int timeLengthSeconds) {
		super(itemId, price, title, author, bookGenre);
		this.timeLengthSeconds = timeLengthSeconds;
	}
	
	

}
