package com.fdm.immutableClassesExercise;

public class Trainee {
	
	String name;
	String stream;
	int week;
	
	
	public Trainee(String name, String stream, int week) {
		super();
		this.name = name;
		this.stream = stream;
		this.week = week;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	@Override
	public String toString() {
		return "Trainee [name=" + name + ", stream=" + stream + ", week=" + week + "]";
	}
	
	
	

}
