package com.fdm.immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;


public class Trainer {
	
	String name;
	
	List<String> streamsTaught = new ArrayList<>();
	
	
	
	public Trainer(String name) {
		super();
		this.name = name;
		
	}

	public void addStream(String stream) {
		streamsTaught.add(stream);
	}
	
	public List<String> getAllStraems(){

		return streamsTaught;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", streamsTaught=" + streamsTaught + "]";
	}
	
	

}
