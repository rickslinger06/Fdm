package com.fdmgroup.dependenciesExercises.copy;

public class Computer {
	
	private String model;
	private HardDrive hardDrive;
	private Memory memory;
	private Processors processor;
	
	
	public Computer(String model, HardDrive hardDrive, Memory memory, Processors processor) {
		super();
		this.model = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.processor = processor;
	
		
		
		
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Processors getProcessor() {
		return processor;
	}

	public void setProcessor(Processors processor) {
		this.processor = processor;
	}

	//on/Off method
	public void turnON() {
		System.out.println("Computer is On");
	}
	
	public void turnOff() {
		System.out.println("Computer is off");
	}

	//get power method
	
	public void getPower(PowerSource powersource) {
		System.out.println(powersource.getWatts() +"watts received from power source");
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", hardDrive=" + hardDrive + ", memory=" + memory + ", processor="
				+ processor + "]";
	}
	
	
}
