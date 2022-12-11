package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService {

	DatabaseReader mockDatabaseReader;
	DatabaseWriter mockWriter;
	
	
	
	public GroupController(DatabaseWriter mockWriter) {
		super();
		this.mockWriter = mockWriter;
	}

	@Override
	public Map<String, Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		
	}

}
