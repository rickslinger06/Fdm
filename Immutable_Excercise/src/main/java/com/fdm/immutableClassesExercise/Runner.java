package com.fdm.immutableClassesExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		

		Trainee t1 = new Trainee("John", "Java", 4);
		Trainee t2 = new Trainee("Pater", "Python", 6);
		Trainee t3 = new Trainee("Max", "Cloud", 8);
		
		
		ArrayList<Trainee> trainees =  new ArrayList<>(Arrays.asList(t1,t2,t3));
		
		
		for(Trainee t : trainees) {
			System.out.println(t);
			
		}
		
		Trainer trainer = new Trainer("Michael");
			
		trainer.addStream("Java");
		trainer.addStream("Business");
		trainer.addStream("SQl");
		
		CompletedClass completedclass = new CompletedClass("Java", trainer, trainees);
		
	
		t1.setWeek(10);
		t2.setWeek(10);
		t3.setWeek(10);
		
		
		
		for(Trainee t : completedclass.getTRAINEES()){
			System.out.println(t);
		}
		
		
		
		
		
		System.out.println(completedclass.getTRAINER());
		
		trainer.addStream("Project Management");
		
		
		for(String t : trainer.getAllStraems()) {
			System.out.println(t);
		}
		
		
		
		
		
		
	}
}
