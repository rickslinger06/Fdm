package com.fdmgroup.loops;

public class reverseString {

	public static void main(String[] args) {
		String textString = "desrever neeb sah txet siht";
		char [] charString = textString.toCharArray();
		
		String reversed = "";
		
		for(char i : charString) {
			reversed = i + reversed;
			
		}
		System.out.println(reversed);
		
		
	}

}
