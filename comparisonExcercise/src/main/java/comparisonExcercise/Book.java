package comparisonExcercise;

public class Book {

	String title;
	int isbn;
	double price;
	int numberOfPages;
	double rating;
	
	public Book(String title, int isbn, double price, int numberOfPages, double rating) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
	}
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + ", numberOfPages=" + numberOfPages
				+ ", rating=" + rating + "]";
	}




}
