package com.mypractice.practoce1;

import java.util.Arrays;

public class practice1 {
	
	public static void main(String[] args) {
		
		int [] num = {1,4,5,7,8};
		int target = 6;
		
		System.out.println(Arrays.toString(twosum(num, target)));
		
	}

	public static int[] twosum(int[] num, int target) {

		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if(num[i] + num[j] == target) {
					return new int[]{i,j};
				}
				
			}

		}
		return null;
	}
	
	
	

}
