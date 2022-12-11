package com.Fdm.Treading;

public class Sequence {

	private int value  = 0;
	
		public synchronized int getnext() {
			value++;
			return value;
}
}
