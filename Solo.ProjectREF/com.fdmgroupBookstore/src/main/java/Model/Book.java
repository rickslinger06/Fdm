package Model;

import java.util.Objects;

public class Book {
	
	 int itemId;
	private double price;
	private String title;
	private String author;
	private BookGenre bookGenre;
	
	public Book(int itemId, double price, String title, String author, BookGenre bookGenre) {
		
		this.itemId = itemId;
		this.price = price;
		this.title = title;
		this.author = author;
		this.bookGenre = bookGenre;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookGenre getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(BookGenre bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "Book [itemId=" + itemId + ", price=" + price + ", title=" + title + ", author=" + author
				+ ", bookGenre=" + bookGenre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookGenre, itemId, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookGenre == other.bookGenre && itemId == other.itemId
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

}
