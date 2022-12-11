package com.fdmgroupStaticKeyword;

public class Runner {

	public static void main(String[] args) {
		
		//Part 1 – Creating a utility class
		
		
		EnergyMatterCalculator.energyToMatter(40);
		EnergyMatterCalculator.matterToEnergy(20);
		
		
		
		// Part 2 – Creating a class with a static variable
		
		Employee.setMinimumWage(9.53);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.setHourlyWage(5.30);
		emp2.setHourlyWage(7.99);
		emp3.setHourlyWage(10.67);
		
		System.out.println(emp1.getHourlyWage());
		System.out.println(emp2.getHourlyWage());
		System.out.println(emp3.getHourlyWage());

	

	}

}
