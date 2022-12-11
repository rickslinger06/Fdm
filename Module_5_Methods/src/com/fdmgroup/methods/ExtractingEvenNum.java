package com.fdmgroup.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractingEvenNum {

	public static void main(String[] args) {

		int [] nums = {1,2,4,14,2,34,45,34,67,80};
		System.out.println(ExtractingEvenNumbers(nums));

	}
	
	public static ArrayList<Integer> ExtractingEvenNumbers(int[] nums) {
			
		
		ArrayList<Integer> evenArray = new ArrayList<>();
		
			for(int i : nums) {
				if(i % 2 == 0) {
					evenArray.add(i);	
				}	
			}
			return evenArray;
		
	}
	
	}
