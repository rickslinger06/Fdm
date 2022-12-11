package com.fdmgroup.classesAndObjectsExercises;



public class Runner {

	public static void main(String[] args) {
		
		HardDrive drive1 = new HardDrive("Seagate",2 , 50);
		HardDrive drive2 = new HardDrive("Dell",3 , 500);
		
		
		System.out.println("Drive1:");
		System.out.println("Model: " + drive1.getModel());
		System.out.println("Capacity: " + drive1.getCapacity()+ "TB");
		System.out.println("Model: " + drive1.getUsedSpace() + "GB");
		System.out.println();
		System.out.println("Drive2:");
		System.out.println("Model: " + drive2.getModel());
		System.out.println("Capacity: " + drive1.getCapacity()+ "TB");
		System.out.println("Model: " + drive1.getUsedSpace() + "GB");
		
		
		System.out.println();
		
		Memory memory1 = new Memory("Kingston", 4, 1600);
		Memory memory2 = new Memory("Cosair", 8, 1333);
		
		System.out.println("Memory1:");
		System.out.println("Model: " + memory1.getModel());
		System.out.println("Capacity: " + memory1.getCapacity()+ "GB");
		System.out.println("Speed: " + memory1.getSpeed());
		System.out.println();
		System.out.println("Memory 2:");
		System.out.println("Model: " + memory2.getModel());
		System.out.println("Capacity: " + memory2.getCapacity()+ "GB");
		System.out.println("Model: " + memory2.getSpeed());
		
		System.out.println();
		
		Processors processor1 = new Processors("Intel Xeon", 6, 2.93);
		Processors processor2 = new Processors("Intel Celeron", 2, 2.9);
		
		System.out.println("processor1:");
		System.out.println("Model: " + processor1.getModel());
		System.out.println("Capacity: " + processor1.getCores());
		System.out.println("Speed: " + processor1.getSpeed());
		System.out.println();
		System.out.println("processor2:");
		System.out.println("Model: " + processor2.getModel());
		System.out.println("Capacity: " + processor2.getCores());
		System.out.println("Model: " + processor2.getSpeed());
		
		
		
		
		
	}

}
