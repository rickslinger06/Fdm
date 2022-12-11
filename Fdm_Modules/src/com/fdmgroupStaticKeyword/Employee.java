package com.fdmgroupStaticKeyword;

public class Employee {
	
	private String name;
	private String JobTitle;
	private double hourlyWage;
	private static double minimumWage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage < minimumWage) {
			hourlyWage = minimumWage;
						
		}else {
			
		}this.hourlyWage = hourlyWage;
	}
	public static double getMinimumWage() {
		return minimumWage;
	}
	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
	
	
	

	
	

}
