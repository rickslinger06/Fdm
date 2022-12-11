package comparisonExcercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		

		Book book1 = new Book("Learn Java", 45678, 19.99, 500, 4.3);
		Book book2 = new Book("Learn UNIX", 65432, 17.50, 650, 3.9);
		Book book3 = new Book("Learn SQL", 87956, 9.75, 220, 4.4);
		Book book4 = new Book("Learn Agile", 35367, 25.5, 500, 4.4);
		Book book5 = new Book("Learn React", 55676, 28.75, 490, 4.8);
		Book book6 = new Book("Learn JavaScript", 34343, 14.99, 500, 4.4);
		Book book7 = new Book("Learn Python", 65767, 27.25, 500, 4.1);
		

		List<Book> bookList = Arrays.asList(book1,book2,book3,book4,book5,book6,book7);
		
		Collections.sort(bookList,new ratingDescendingPriceAscending());
		
		
		for(Book i : bookList) {
			
			System.out.println(i);
		}
		
		
		System.out.println("================================");
		
		final Set<Book> bookSet = new TreeSet<>(new ratingDescendingPriceAscending());
		
		bookSet.addAll(bookList);
		
		
		for(Book book : bookSet) {
			System.out.println(book);
		}
		
	}
	
	

}
