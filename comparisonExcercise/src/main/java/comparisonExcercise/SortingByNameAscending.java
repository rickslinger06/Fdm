package comparisonExcercise;

import java.util.Comparator;

public class SortingByNameAscending implements Comparator<Book> {
	
	public int compare(Book o1, Book o2) {
		if(o1.getTitle() == o2.getTitle()) 
			return 0;
		if(o1.getTitle() == null) 
			return 1;
		 if(o2.getTitle() == null) 
			return -1;
		 return o1.getTitle().compareTo(o2.getTitle());
	
	}

	}
