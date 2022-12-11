package com.fdmGroup_Comparators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
//		
		Trainee trainee1 = new Trainee("jogn",34);
		Trainee trainee2 = new Trainee("Adam",24);
		
		System.out.println(trainee1.compareTo(trainee2));

	
		//all are equal beacuse it will all be one because we cast double to int and it round down to 1
		
		Snack snack1 = new Snack(1.00, "Choccolate", 175);
		Snack snack2 = new Snack(1.50, "Skittles", 85);
		Snack snack3 = new Snack(1.00, "Potato Chips", 150);
		Snack snack4 = new Snack(1.75, "Choccolate", 175);
		
	
		
		final Set<Snack> snackSet = new TreeSet<>(new SnackCostComaprator());
		
		snackSet.add(snack1);
		snackSet.add(snack2);
		snackSet.add(snack3);
		snackSet.add(snack4);
		
	
		
		for(Snack i : snackSet) {
			System.out.println(i);
		}
		
	List<Snack> snackList = Arrays.asList(snack1,snack2,snack3,snack4);
	
	Collections.sort(snackList,new SnackCostComaprator());
	
	System.out.println(snackList);
	
	
	
	
	String a = "a";
	String b = "b";
//	String c = new String("a");
//	String d = a;
//	
//	
//	System.out.println(a == b);
//	System.out.println(a == c);
//	System.out.println(a == d);
	
	System.out.println(a == b);
	
	

	
	
	
		
	}
	
	

	
	
	
	
}

