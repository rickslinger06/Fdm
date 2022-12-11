package com.fdmgroup.loops;

public class FirstNumberOver100 {

	public static void main(String[] args) {
		
		int [] num = {6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91};
		
		for(int i : num) {
			if(i > 100) {
				System.out.println(i);
			}
		}
		
		
	}

}
