package com.fdmgroup_dependency;

import java.util.ArrayList;

public class ComputerStore {
	
	String name;
	ArrayList<Computer> computers = new ArrayList<>();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public ArrayList<Computer> getallComputers() {
		return computers;
		
	}
	

}
