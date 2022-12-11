package com.fdmgroup.methods;

public class medianNumber {

	public static void main(String[] args) {
	
		double [] num = {1.0, 2.0, 5.0, 4.0};
		
		System.out.println(MedianNumber(num));

	}
	
	public static double MedianNumber(double[]num) {
		
		int numLen = num.length;
		int numPosition= (int) (numLen / 2);
		double OddArrayLen = num[(int) numPosition];
		if(numLen % 2 ==0) {
			double evenArrayLen = (num[(int) numPosition] + num[(int) (numPosition -1)]) / 2;
			return (double)evenArrayLen;
		}
		return (double)OddArrayLen;
			
		
	
		}
}
