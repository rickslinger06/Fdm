package com.fdmgroup.classesAndObjectsExercises;

public class Processors {
	
	String model;
	double cores;
	double speed;
	public Processors(String model, double cores , double speed) {
		super();
		this.model = model;
		this.speed = speed;
		this.cores = cores;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getCores() {
		return cores;
	}
	public void setCores(double cores) {
		this.cores = cores;
	}
	
	

}
