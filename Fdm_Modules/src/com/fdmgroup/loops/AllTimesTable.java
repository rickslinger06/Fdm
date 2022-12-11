package com.fdmgroup.loops;

public class AllTimesTable {

	public static void main(String[] args) {
		
		int timesTable = 12;
		
		for(int i = 1 ; i < timesTable+1; i++) {
			System.out.println("Times Table: " + i);
			
			for(int num = 2; num < timesTable+1; num++) {
				System.out.println(num + "x" + i + " = " + (i+num));
			}
		}System.out.println();
		
	}

}
