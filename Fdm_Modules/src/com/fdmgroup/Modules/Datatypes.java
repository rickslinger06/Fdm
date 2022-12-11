package com.fdmgroup.Modules;

public class Datatypes {

	public static void main(String[] args) {
		
		//Section 1 - Strings  
		//1.1 Simple Message 1.2 full name
		
		String firstName = "Rickster";
		String secondName = "Muyco";
		String fullName = firstName +" "+ secondName;
		System.out.println(fullName);
		
		
		//1.3 Personal message
		
		String personsName = "Eric";
		System.out.println("Hello "+ personsName +",would you like to learn some java today?");

		String myName = "Rickster";
		int nameLength = myName.length();
		String uppeCaseName = myName.toUpperCase();
		char nameFirstLetter = myName.charAt(0);
		char nameLastLetter = myName.charAt(nameLength-1);
		
		System.out.println(nameLength);
		System.out.println(uppeCaseName);
		System.out.println(nameFirstLetter);
		System.out.println(nameLastLetter);
		
		//Sentence Operation
		
		String text = "this is a sentence";
		int firstSpace = text.indexOf(" ");
		int lastSpace = text.lastIndexOf(" ");
		int firstLetterX = text.indexOf('x');
		String first4Char = text.substring(0,4);
		String stringSentence = text.substring(10,text.length());
		String isAchar = text.substring(5,9);
		boolean containsA = text.contains("a");
		boolean containsX = text.contains("x");
		String firstword = "is";
		String lastword = "?";
		String newtext = firstword+ " " + text.toUpperCase().charAt(0)+ text.substring(1,text.length()) + lastword;
		
		
		System.out.println(firstSpace);
		System.out.println(lastSpace);
		System.out.println(firstLetterX);
		System.out.println(first4Char);
		System.out.println(stringSentence);
		System.out.println(isAchar);
		System.out.println(containsA);
		System.out.println(containsX);
		System.out.println(newtext);
		
		//Section 2 – Primitive Numbers
		//2.1 Favourite number
		
		int faveNum = 8;
        System.out.println("My favourite number is " + faveNum);

        // 2.2 Adding Integers 

        int num1 = 5;
        int num2 = 3;
        int num3 = num1 + num2;

        System.out.println(num3);

        // 2.3 Arithmetic

        int counter = 0;

        counter = counter + 1;
        System.out.println(counter);
        counter += 5;
        counter-=1;
        counter -= 2;
        counter *= 2;
        System.out.println("Final value of the counter is " + counter);

        // 2.4 Dividing doubles 

        int numA = 5;
        int numB = 2;
        double numC = 5;
        double numD = 2;

        int AdividedbyB = numA / numB;
        double valueDouble = numC / numD;
        double CdividebyD = numC / numB;
        double AdividebyD = numA / numD;

        System.out.println(AdividedbyB);
        System.out.println(CdividebyD);
        System.out.println(valueDouble);
        System.out.println(AdividebyD);

        // 3.1 Unicode numbers

        char letter = 'a';
        int code = 98;

        System.out.println((int) letter);
        System.out.println((char) code);
        System.out.println((char) 36);

        // 3.2 Differences between letters 
        
        int CminusA = 'c' - 'a';
        System.out.println(CminusA);
        System.out.println('z' - 'a');

        // 3.1 Adding char and Strings 

        char char1 = 'x';
        char char2 = 'y';
        char char3 = 'z';

        String string1 = "z";
        String string2 = "y";
        

        int sumOfChar1to3 = char1 + char2 + char3;
      
        System.out.println(sumOfChar1to3);
        System.out.println(char1 + char2 + string2);
        System.out.println(char1 + string1 + char3);

        // 4.1 Wrappers Convert Strings into integer

        String number1 = "5";
        String number2 = "3";
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);

        System.out.println(n1 + n2);

        // 4.2 Wrappers Convert Strings into doubles
        
        String d1 = "5.3";
        String d2 = "3.2";
        double convertDbl1 = Double.parseDouble(d1);
        double convertDbl2 = Double.parseDouble(d2);

        System.out.println(convertDbl1 + convertDbl2);

        // 4.3 Extracting numbers from Strings

        String stringNum1 = "abc11";
        String stringNum2 = "9xyz";
        String stringNum3 = "abc7xyz";

        String s1 = stringNum1.substring(3, 5);
        String s2= stringNum2.substring(0, 1);
        String s3 = stringNum3.substring(3, 4);

        int S1toInteger = Integer.parseInt(s1);
        int S2toInteger = Integer.parseInt(s2);
        int S3toInteger = Integer.parseInt(s3);
        
        int sumOfStringNumbers = S1toInteger + S2toInteger + S3toInteger;

        System.out.println(sumOfStringNumbers);

        
    }	
			

	}


