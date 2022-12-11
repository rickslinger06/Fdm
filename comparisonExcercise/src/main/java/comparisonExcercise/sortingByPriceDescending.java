package comparisonExcercise;

import java.util.Comparator;

public class sortingByPriceDescending implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		if(o1.getPrice() > o2.getPrice()) {
			return -1;
		}else if(o1.getPrice() < o2.getPrice()) {
			return 1;
		}else {
		return 0;
	}
	}
}
