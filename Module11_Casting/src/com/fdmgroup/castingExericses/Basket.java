package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class Basket {
	
	
	
	private ArrayList<BasketItem> basketitems = new ArrayList<>();
	
	
	public void addItem(BasketItem basketItem) {
		basketitems.add(basketItem);
	}
	
	public void removeItem(BasketItem basketItem) {
		basketitems.remove(basketItem);
	}
	
	public ArrayList<BasketItem> getAllItems(){
		return basketitems;
		
	}

	@Override
	public String toString() {
		return "Basket [basketitems=" + basketitems + "]";
	}
	
	

}
