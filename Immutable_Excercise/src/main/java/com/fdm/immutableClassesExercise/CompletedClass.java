package com.fdm.immutableClassesExercise;

import java.util.ArrayList;
import java.util.List;

public final class CompletedClass {
	
	private final String subject ;
	private final Trainer trainer;
	private final List<Trainee> trainees=  new ArrayList<>();
	
	public CompletedClass(String subject, Trainer trainer, List<Trainee> trainees) {
		super();
		this.subject = subject;;
		this.trainer = trainer;
		
		
		for(Trainee trainee : trainees) {
			Trainee clonedTrainee = new Trainee(trainee.getName(),trainee.getStream(),trainee.getWeek());
			this.trainees.add(clonedTrainee);
		}
		
		
	}
	public String getSUBJECT() {
		return subject;
	}
	public Trainer getTRAINER() {
		Trainer clonedTrainer = new Trainer(trainer.getName());
		return clonedTrainer;
		
	}
	public List<Trainee> getTRAINEES() {
		
		List<Trainee> clonedTrainees = new ArrayList<>();
		for(Trainee trainee : trainees) {
			Trainee clonedTrainee = new Trainee(trainee.getName(), trainee.getStream(), trainee.getWeek());
			clonedTrainees.add(clonedTrainee);
		}
		return clonedTrainees;
		
		
		
	}
	@Override
	public String toString() {
		return "CompletedClass [subject=" + subject + ", trainer=" + trainer + ", trainees=" + trainees + "]";
	}
	
	
	
	
	
	
	

}
