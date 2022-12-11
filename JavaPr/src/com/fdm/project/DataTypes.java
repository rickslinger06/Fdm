package com.fdm.project;

public class DataTypes {

	public static void main(String[] args) {
	
		//Section 1.1 - Strings Simple Message

        String first = "Rickster";
        String last = "Muyco";
        String fullName = first + " " + last;
        System.out.println(fullName);

        //1.3 Personal Message
        
        String name = "Eric";
        System.out.println("Hello " + name);

        //1.4 Name operations
        
        int namelength = fullName.length();
        String UpperCaseName = fullName.toUpperCase();
        String FirstLetter = fullName.substring(0, 1);
        String lastLetter = fullName.substring(namelength - 1);

        System.out.println(namelength);
        System.out.println(UpperCaseName);
        System.out.println(FirstLetter);
        System.out.println(lastLetter);

        //1.5: Sentence operations
        
        String text = "this is a sentence";

        int firstSpace = text.indexOf(" ");
        int lastSpace = text.lastIndexOf(" ");
        int findx = text.indexOf("x");
        String firstFourLetters = text.substring(0, 4);
        String LastWord = text.substring(10, text.length());
        String positionFIvetoEight = text.substring(5, 9);
        boolean containLetterA = text.contains("a");
        boolean containLetterX = text.contains("x");

        System.out.println(firstSpace);
        System.out.println(lastSpace);
        System.out.println(findx);
        System.out.println(firstFourLetters);
        System.out.println(LastWord);
        System.out.println(positionFIvetoEight);
        System.out.println(containLetterA);
        System.out.println(containLetterX);

        //Section 2 – Primitive Numbers Favourite number

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

        int S1tointeger = Integer.parseInt(s1);
        int S2tointeger = Integer.parseInt(s2);
        int S3tointeger = Integer.parseInt(s3);
        
        int sumOfStringNumbers = S1tointeger + S2tointeger + S3tointeger;

        System.out.println(sumOfStringNumbers);

        
    }

	}


