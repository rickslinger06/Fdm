package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService {

	@Override
	public String getClassification(double mark) {

		String result = "";

		if (mark < 75.00) {
			result += "fail";

		} else if (mark < 80) {
			result += "pass";
			
		} else if (mark < 90) {
			result += "merit";

		} else if (mark <= 100) {

			result += "distinction";
		}

		return result;

	}
}
