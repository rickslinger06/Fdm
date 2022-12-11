package com.fdmgroup.methods;

public class Palindrome {

	public static void main(String[] args) {
	
		String text = "kayoak";
		System.out.println(Palindrome(text));

	}

	
	public static boolean Palindrome(String str) {
		char[] word = str.toCharArray();
		
		String reversedWord = "";
		for(char l : word) {
			reversedWord = l +reversedWord;
			if(str.equals(reversedWord)) {
				return true;
			}
			
		}
		return false;
		
	}

}
