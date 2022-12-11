package com.mypractice.practoce1;

public class Module_1 {

	public static void main(String[] args) {
		
		String name = "Rickster".toUpperCase();
		int len = name.length();
		
		char[] nameArray = name.toCharArray();
		
		System.out.println(name);
		System.out.println(len);
		System.out.println(nameArray[0]);
		System.out.println(nameArray[len-1]);
		
		
		
		String text = "this is a sentence";
		
		int firstSpace = text.indexOf(" ");
		int lastSpace = text.lastIndexOf(" ");
		System.out.println(firstSpace);
		System.out.println(lastSpace);
		
		System.out.println(text.indexOf("x"));
		
		String first4char = text.substring(0,4);
		System.out.println(first4char);
		
		int textlen = text.length();
		
		System.out.println(text.substring(5, textlen));
		
		
		System.out.println(text.contains("a"));
		System.out.println(text.contains("x"));
		

		String newValue = "is " + text + "?";
		System.out.println(newValue);
	
		
		String finalValue = newValue.replaceFirst("t", "T");
		System.out.println(finalValue);
		
		
		int counter =0 ;
		counter +=1;
		counter += 5;
		counter -=1;
		counter -= 2;
		counter *= 2;
		
		System.out.println(counter);
		
		
		int a =5;
		int b = 2;
		double c =5;
		double d =2;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		
		
		
		char letter = 'a';
		int code = 98;
		
		System.out.println((int)letter);
		System.out.println((char)code);
		System.out.println((char)36);
		
		
		System.out.println('c'-'a');
		
		int zMinus1 = 'z' - 'a';
		System.out.println(zMinus1);
		
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		
		
		String string1 = "z";
		String string2 = "y";
		
		System.out.println(char1+char2+char3);
		System.out.println(char1+char2+string2);
		
		
		String num1 ="5";
		String num2 ="3";
		
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);
		
		System.out.println(int1+int2);
		
		
		String s1 ="abc11";
		String s2 ="9xyz";
		String s3 ="abc7xyz";
			
		
		
		
				
		

	}

}
