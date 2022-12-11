package com.fdmgroup_dependency;

public class Computer {
	
	String model;
	HardDrive hardDrive;
	Memory memory;
	Processor processor;
	
	
	
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
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
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public void turnOn() {
		System.out.println("computer is on");
	}
	
	public void turnOff() {
		System.out.println("computer is on");
	}

	// getPower method
	
	public void  getPower(PowerSource powerSource) {

		System.out.println(powerSource.supplyPower() + " watts received from power source");
		
	}
	
	
	

	@Override
	public String toString() {
		return "Computer [model=" + model + ", hardDrive=" + hardDrive + ", memory=" + memory + ", processor="
				+ processor + "]";
	}
	
	
	
	

}
