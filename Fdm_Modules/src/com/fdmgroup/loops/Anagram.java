package com.fdmgroup.loops;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		
		System.out.println(isAnagram("meait","teami"));
		
	}
		
		public static boolean isAnagram(String str1, String str2) {
			
			char[] text1 = str1.toCharArray();
			char[] text2 = str2.toCharArray();
			
			if(text1.length != text2.length) {
				return false;
			}
			
			Arrays.sort(text1);
			Arrays.sort(text2);
			
			return Arrays.equals(text1,text2);
			
			
	}

}
