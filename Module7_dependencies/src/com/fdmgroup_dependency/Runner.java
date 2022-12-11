package com.fdmgroup_dependency;

public class Runner {

	public static void main(String[] args) {
			
		
		HardDrive hardDrive1 = new HardDrive();
		Memory memory1 = new Memory();
		Processor processor1 = new Processor();
		
		Computer computer1 = new Computer("Dell",hardDrive1, memory1, processor1);
		
		HardDrive hardDrive2 = new HardDrive();
		Memory memory2 = new Memory();
		Processor processor2 = new Processor();
		
		Computer computer2 = new Computer("lenovo",hardDrive2, memory2, processor2);
		
		System.out.println(computer1);
		System.out.println(computer2);
		
		
		PowerSource powerSource1 = new PowerSource();
		powerSource1.setWatts(40);
		computer1.getPower(powerSource1);
	
		
		ComputerStore computerStore1 = new ComputerStore();
		computerStore1.addComputer(computer1);
		computerStore1.addComputer(computer2);
		
		
		
		System.out.println(computerStore1.getallComputers());

	}

}
