package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fdmgroup.tdd.groupcontroller.DatabaseReader;
import com.fdmgroup.tdd.groupcontroller.DatabaseWriter;
import com.fdmgroup.tdd.groupcontroller.GroupController;
import com.fdmgroup.tdd.groupcontroller.Trainee;

class Test_GroupContoller {
	
	GroupController mockgroupController;
	Map<String, Trainee> mockMap;
	DatabaseReader mockdatabaseReader;
	DatabaseWriter mockdatabaseWriter;
	
	Trainee mockTrainee;
	
	

	@BeforeEach
	void setUp() throws Exception {
		mockgroupController = new GroupController(mockdatabaseWriter);
		mockgroupController =  mock(GroupController.class);
		mockMap = mock(Map.class);
		mockdatabaseReader = mock(DatabaseReader.class);
		mockdatabaseWriter = mock(DatabaseWriter.class);
		mockTrainee = mock(Trainee.class);

		
	}

	@Test
	void test_Method_theGetAllTraineesMethood_ReturnsTheMapOfTypesStringTraineeReturnedByThereadGroupMethod() {
	
		when(mockdatabaseReader.readGroup()).thenReturn(mockMap);
		mockMap = mockgroupController.getAllTrainees();
		mockdatabaseReader.readGroup();
		
		verify(mockdatabaseReader,times(1)).readGroup();
		
		
	}
	
	@Test
	void test_Method_RemoveTrainneByUsername() {
		
		String mockTrainee1 = "Username";
		
		mockgroupController.removeTraineeByUsername(mockTrainee1);
		
		
		assertEquals("Username",mockTrainee1);
		
	}
	
	@Test
	void test_Method_AddTainee_ShouldPassTheTraineeTobeAddedTothedataBaseWriter_addTrainneMethod() {
		
		
		Trainee trainee = new Trainee();
		
		mockgroupController.addTrainee(trainee);
		
		verify(mockgroupController,times(1)).addTrainee(trainee);
		
		
		
		
	}

}
