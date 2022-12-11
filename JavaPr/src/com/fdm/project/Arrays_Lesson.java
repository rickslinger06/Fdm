package com.fdm.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_Lesson {

	public static void main(String[] args) {
		
		String [] friends =  {"James","Jordan","Jay", "Joy", "Joseph"};
		
		
		
		System.out.println(friends.length);
		
		friends[4]= "Peter";
		
		
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		System.out.println(friends[3]);
		System.out.println(friends[4]);
		
		
		Arrays.sort(friends);
		
		System.out.println(Arrays.toString(friends));
		
		System.out.println(friends[0]);
		System.out.println(friends[4]);
		
		friends[1] = null;
		
		System.out.println(Arrays.toString(friends));
		
		System.out.println(friends.length);
		
		
		//Poker hand 1.2
		
		String [] pokerhand = new String[5];
		pokerhand[0] ="Queen of Hearts";
		pokerhand[1] ="3 of Spades";
		pokerhand[2] ="3 of Diamonds";
		pokerhand[3] ="9 of Hearts";
		pokerhand[4] ="6 of CLubs";
		
		System.out.println(Arrays.toString(pokerhand));
		
		
		//Array list 2.1 Shopping BAsket///
		
		
		ArrayList<String> shoppingBasket = new ArrayList<>();
		shoppingBasket.add("milk");
		shoppingBasket.add("cereals");
		shoppingBasket.add("apples");
		shoppingBasket.add("orange");
		shoppingBasket.add("bread");
		
		System.out.println(shoppingBasket.size());
		System.out.println(shoppingBasket.get(0));
		System.out.println(shoppingBasket.get(4));
		shoppingBasket.remove(4);
		System.out.println(shoppingBasket.size());
		shoppingBasket.remove(2);
		System.out.println(shoppingBasket);
		
		shoppingBasket.add("potatoes");
		shoppingBasket.add("olive oil");
		shoppingBasket.add("chicken");
		
	
		
		Collections.sort(shoppingBasket);
		
		System.out.println(shoppingBasket);
		
		//2.2 Salaries
		
		
		ArrayList<Integer> salaries = new ArrayList<>();
		
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.min(salaries));
		System.out.println(Collections.frequency(salaries,42000));
		
		Collections.sort(salaries);
		System.out.println(salaries.get(3));
		
		Collections.reverse(salaries);
		System.out.println(salaries.get(0));
		System.out.println(salaries.get(6));
		
		
		
		
		
		
		

	}

}
