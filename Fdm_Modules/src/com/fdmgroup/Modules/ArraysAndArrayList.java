package com.fdmgroup.Modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAndArrayList {

	public static void main(String[] args) {
	
		//Section 1 - Arrays
		//1.1 Friends array
		
		String [] friends = {"James","Bencher","calvin","kevin","scott"};
		
		
		System.out.println(friends.length);
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		System.out.println(friends[3]);
		System.out.println(friends[4]);
		
		friends[4] = "Joseph";
		
		Arrays.sort(friends);
		
		System.out.println(friends[0]);
		System.out.println(friends[4]);
		
		friends[1] = null;
		
		System.out.println(Arrays.toString(friends));
		
		//1.2 Poker Hand
		
		String [] pokerHand = new String[5];
		pokerHand[0]= "Queen of hearts";
		pokerHand[1]= "3 of spades";
		pokerHand[2]= "3 of diamonds";
		pokerHand[3]= "9 of hearts";
		pokerHand[4]= "6 of clubs";
		
		System.out.println(Arrays.toString(pokerHand));
		
		
		//Section 2 – ArrayLists
		//2.1 Shopping basket
		
		ArrayList<String> shoppigBasket = new ArrayList<>();
		shoppigBasket.add("milk");
		shoppigBasket.add("cereals");
		shoppigBasket.add("apples");
		shoppigBasket.add("oranges");
		shoppigBasket.add("bread");
		
		System.out.println(shoppigBasket.size());
		System.out.println(shoppigBasket.get(0));
		System.out.println(shoppigBasket.get(4));
		
		shoppigBasket.remove(4);
		shoppigBasket.remove(2);
		
		System.out.println(shoppigBasket);
		
		shoppigBasket.add("potaoes");
		shoppigBasket.add("olive oil");
		shoppigBasket.add("chicken");
		
		Collections.sort(shoppigBasket);
		
		System.out.println(shoppigBasket.get(0));
		System.out.println(shoppigBasket.get(5));
		
		
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
