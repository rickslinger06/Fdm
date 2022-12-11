package com.fdmgroup.dependenciesExercises;



public class Runner {

	public static void main(String[] args) {
		
		HardDrive drive1 = new HardDrive(2);
		Memory memory1 = new Memory(6.6);
		Processors processor1 = new Processors("Intel");
		
		PowerSource source1 = new PowerSource();
		source1.setWatts(10.5);
		
		
		Computer computer1 = new Computer("Dell", drive1, memory1, processor1);
		
		Computer computer2 = new Computer("Lenovo", drive1, memory1, processor1);
		
		computerStore computerStore1 = new computerStore();
		computerStore1.addComputer(computer1);
		computerStore1.addComputer(computer2);
		computerStore1.getAllComputers();
		
		
		System.out.println(computerStore1.getAllComputers());
		
		System.out.println(computer1);
		System.out.println(computer2);
		
		
	computer1.getPower(source1);
		
		
	}

}
