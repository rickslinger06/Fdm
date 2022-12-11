package com.fdmGroup_Comparators;

import java.util.Objects;

public class Snack implements Comparable<Snack> {
	
	double cost;
	String name;
	int calories;
	public Snack(double cost, String name, int calories) {
		super();
		this.cost = cost;
		this.name = name;
		this.calories = calories;	
		
	}
	
	
	@Override
	public int compareTo(Snack anotherSnack) {
		
		if(this.getCalories() > anotherSnack.getCalories()){
		return 1;
		
	}else if(this.getCalories() < anotherSnack.getCalories()) {
		return -1;
		
	}
		return 0;
	
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	

	
	@Override
	public int hashCode() {
		return Objects.hash(calories, cost, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return calories == other.calories && Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Snack [cost=" + cost + ", name=" + name + ", calories=" + calories + "]";
	}
	

}
