package testShoppingApp;

public class Checkout{

	

	public double calculatePrice(Basket basket) {
	
		
		double price = 0.0;

		for (Book book : basket.getBooksInBasket()) {
			price += book.price ;
		}
	
		
		if(basket.getBooksInBasket().size() >= 10) {
			price *= .87;
			
		}else if(basket.getBooksInBasket().size() >= 7) {
			price *= .98;
					
		}else if(basket.getBooksInBasket().size() >= 3) {
			price *= .99;
					
		}
		
		return price;
	}

//	public static int gettotal_SameBookInBasket(Basket basket) {
//		int totalNumberOfSameBook = 0;
//		for (Book book : basket.getBooksInBasket()) {
//			if(book.getName().equals(book.getName()))
//				
//			totalNumberOfSameBook ++;
//		}
//		
//		
//		return totalNumberOfSameBook;
//	}
	

}
