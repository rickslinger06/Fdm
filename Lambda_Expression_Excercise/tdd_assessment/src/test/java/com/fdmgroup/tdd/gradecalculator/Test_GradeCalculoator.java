package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_GradeCalculoator {
	
	GradeCalculator gradeCaculator;

	@BeforeEach
	void setUp() throws Exception {
		
		gradeCaculator = new GradeCalculator();
	}

	// “fail” when less than 75===================
	
	
	@Test
	void test_Method_implementing_ClassReturnFailWhenLessThanGradeOf75() {
		
		
		String grade = gradeCaculator.getClassification(74.00);
		
		assertEquals("fail",grade);

	}
	
	@Test
	void test_Method_implementing_ClassReturnFailWhenLessThanGradeOf75AnotherTestMark65() {
		
		
		String grade = gradeCaculator.getClassification(65.00);
		
		assertEquals("fail",grade);
		
		
		//“pass” when greater than or equal to 75 but less than 80======

	}
	@Test
	void test_Method_implementing_ClassReturnPassWhenGreaterThan75ButLessThan80() {
		
		
		String grade = gradeCaculator.getClassification(79.00);
		
		assertEquals("pass",grade);

	}
	
	
	@Test
	void test_Method_implementing_ClassReturnPassWhenGreaterThan75ButTestingMark75() {
		
		
		String grade = gradeCaculator.getClassification(75.00);
		
		assertEquals("pass",grade);

	}
	
	// “merit” when greater than or equal to 80 but less than 90.======
	
	@Test
	void test_Method_implementing_ClassReturnMeritWhenGreaterThan80ButLessThan90() {
		
		
		String grade = gradeCaculator.getClassification(88);
		
		assertEquals("merit",grade);

	}
	
	@Test
	void test_Method_implementing_ClassReturnMeritWhenGreaterThan80ButLessThan90TestingMark80() {
		
		
		String grade = gradeCaculator.getClassification(80);
		
		assertEquals("merit",grade);

	}

	
	
	//“distinction” when greater than or equal to 90 but less than or equal to 100===
	
	@Test
	void test_Method_implementing_ClassReturnDistinctionWhenGreaterThanORequalto90ButLessThanOrEqualto100() {
		
		
		String grade = gradeCaculator.getClassification(99);
		
		assertEquals("distinction",grade);

	}

}
