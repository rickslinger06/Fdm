package com.fdmgroup.loops;

public class SummingMillion {

	public static void main(String[] args) {
		
		
		int num = 1_000_000;
		long sumOfMillion = 0;
		for(int i =0; i< num +1;i++) {
			sumOfMillion+=i;	
		}
		System.out.println(sumOfMillion);

	}

}
