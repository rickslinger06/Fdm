package com.fdmgroup.methods;

public class reversedStringArray {

	public static void main(String[] args) {
		
		
	String text = "This text is being reversed";
	System.out.println(reverseStringArray(text));

	}
	
	public static String reverseStringArray(String str) {
		char[] textArray = str.toCharArray();
		
		String reversed = "";
		for(char l : textArray ){
			reversed = l + reversed;
		}
		return reversed;
	}

}
