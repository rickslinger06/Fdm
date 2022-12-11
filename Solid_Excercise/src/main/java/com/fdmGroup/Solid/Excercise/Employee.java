package com.fdmGroup.Solid.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	List<Employee> employees = new ArrayList<>();
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}
	
	public void removeEmployee(int employeeId) {
		employees.remove(employeeId);
	}
	
	public void updateEmployee(Employee employee) {
		this.employeeId = employeeId;
		this.employeeName =employeeName;
		this.salary =salary;
		
	}
	
	public List<Employee> listEmployee(){
		return employees;
		
	}

	
	
	
	}
	
	
	


