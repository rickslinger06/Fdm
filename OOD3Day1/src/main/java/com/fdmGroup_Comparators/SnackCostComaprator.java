package com.fdmGroup_Comparators;

import java.util.Comparator;

public class SnackCostComaprator implements Comparator<Snack> {

	@Override
	public int compare(Snack snack1, Snack snack2) {
		
		if(snack1.getCost() > snack2.getCost()) {
			return 1;
				
		}else if (snack1.getCost() < snack2.getCost()) {
			return -1;
	
		}return 0;
}
}