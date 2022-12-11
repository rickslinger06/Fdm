package comparisonExcercise;

import java.util.Comparator;

public class ratingDescendingPriceAscending implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		if(o1.getRating() != o2.getRating()) {
			return 1;
		}return o2.getIsbn() - o1.getIsbn();
		
	
		
		
		
	}

}
