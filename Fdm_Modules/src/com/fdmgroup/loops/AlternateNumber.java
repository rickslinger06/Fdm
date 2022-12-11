package com.fdmgroup.loops;

public class AlternateNumber {

	public static void main(String[] args) {
			//2.5 Incrementing alternate numbers
		
		int [] AlternateNumber = {25,15,99,75,47,59,82};
		
		for (int i = 1; i < AlternateNumber.length; i +=2){
			AlternateNumber[i] ++;
		}
						
		for (int i = 0; i < AlternateNumber.length; i ++){
			System.out.println(AlternateNumber[i]);
		}

		
		
	}

}
