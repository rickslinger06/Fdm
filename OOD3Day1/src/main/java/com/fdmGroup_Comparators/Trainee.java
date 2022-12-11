package com.fdmGroup_Comparators;

public class Trainee implements Comparable<Trainee> {
	
	private String name;
	private int age;
	

	public Trainee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Trainee anotherTrainee) {
		if(age != anotherTrainee.getAge()) {
			return age - anotherTrainee.getAge();
			
		}return name.compareTo(anotherTrainee.getName());
		
	}


	@Override
	public String toString() {
		return "Trainee [name=" + name + "]";
	}

	
	
	
	
	
}
