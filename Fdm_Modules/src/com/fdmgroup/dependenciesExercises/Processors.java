package com.fdmgroup.dependenciesExercises;

public class Processors {
	
	String processor;

	public Processors(String processor) {
		super();
		this.processor = processor;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Processors [processor=" + processor + "]";
	}
	
	
	
		
}
