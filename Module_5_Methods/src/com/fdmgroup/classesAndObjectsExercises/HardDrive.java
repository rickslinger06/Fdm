package com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {
	
	private String model;
	private double capacity;
	private double usedSpace;
	
	public HardDrive(String model, double capacity, double usedSpace) {
		super();
		this.model = model;
		this.capacity = capacity;
		this.usedSpace = usedSpace;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	
	
	

}
