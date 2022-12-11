package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class computerStore {
	
	private String name;
	
	private ArrayList<Computer> computers = new ArrayList<>();

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers() {
			return computers;
		}
		
		
		

}
