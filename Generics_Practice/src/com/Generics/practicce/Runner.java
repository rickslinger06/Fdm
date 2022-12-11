package com.Generics.practicce;

public class Runner {
	
public static void main(String[] args) {
	
	
	
	Integer[] intArray = {1,2,3,4,5};
	Character [] charArray = {'h','e','l','l','o'};	
	String [] stringArray = {"String","Array"};
	
	display(intArray);
	display(charArray);
	display(stringArray);
	
	
	System.out.println(first(intArray));
	System.out.println(first(charArray));
	
	
	
	GenericClass<Integer> myInt = new GenericClass<>(23);
	GenericClass<String> myString = new GenericClass<>("String");
	
	System.out.println(myInt.getX());
	System.out.println(myString.getX());
}	
	public static <T> void display(T[] array) {
		
		for(T i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	public static <T> T  first(T[] array) {
		return array[0];
		
		
		
		
	}



}


