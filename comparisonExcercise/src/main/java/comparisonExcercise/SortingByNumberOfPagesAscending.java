package comparisonExcercise;

import java.util.Comparator;

public class SortingByNumberOfPagesAscending implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		if(o1.getNumberOfPages() > o2.getNumberOfPages()) {
			return 1;
		}else if(o1.getNumberOfPages() < o2.getNumberOfPages()) {
			return -1;
		}else {
		return 0;
	}
	}
}
