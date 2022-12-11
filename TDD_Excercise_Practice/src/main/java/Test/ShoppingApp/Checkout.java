package Test.ShoppingApp;

public class Checkout {

	public double calculatePrice(Basket basket) {
		
		
		double price = 0;
		
		
		for (Book book : basket.getBooksInBasket()){
			price += book.price;
			
		}
		
		if(basket.getBooksInBasket().size() == 3) {
			price *= .99;
		}
		
		
		return price;
		
		
		
	}

}
