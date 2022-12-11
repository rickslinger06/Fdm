package comparisonExcercise;

import java.util.Comparator;


public class SortingNumberOfPagesThenIsbn implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		
		if(o1.getNumberOfPages() != o2.getNumberOfPages()) {
			return o1.getNumberOfPages() - o2.getNumberOfPages();
		}
		return o2.getIsbn() - o1.getIsbn();
		}
		
	}
	
	

