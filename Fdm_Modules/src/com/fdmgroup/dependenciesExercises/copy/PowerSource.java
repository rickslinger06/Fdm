package com.fdmgroup.dependenciesExercises.copy;

public class PowerSource {
	
	double watts;

	public double getWatts() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}
	
	public double supplyPower() {
		return watts;
	}

	@Override
	public String toString() {
		return "PowerSource [watts=" + watts + "]";
	}

	
}
