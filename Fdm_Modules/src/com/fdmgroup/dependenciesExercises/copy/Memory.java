package com.fdmgroup.dependenciesExercises.copy;

public class Memory {
	
	double speed;
	
	

	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public Memory(double speed) {
		super();
		this.speed = speed;
		
	}



	@Override
	public String toString() {
		return "Memory [speed=" + speed + "]";
	}
	
	
	
	


	

}
