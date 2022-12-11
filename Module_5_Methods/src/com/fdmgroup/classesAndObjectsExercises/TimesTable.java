package com.fdmgroup.classesAndObjectsExercises;

public class TimesTable {

	public static void main(String[] args) {
		
		displayTimesTablesUp(5);

	}
	
	public static void displayTimesTablesUp(int num) {
		
		for(int i = 1; i < num+1; i++) {
			System.out.println("Times Table number" + i);
			for(int j = 1; j < num+1; j++) {
				System.out.println(j + " x " +i + "= "+ (j+i));
				
			}
			
		}
		
	}

}
