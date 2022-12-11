package com.fdmgroup.Many2Many.bidirectional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class PetOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	@ManyToMany(mappedBy = "owners")
	private List<Pet> pets;
	
	PetOwner(){
		// For JPA
		pets = new ArrayList<>();
	}

	public PetOwner(String name) {
		this();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		List<String> petNames = pets.stream().map(e -> e.getName()).collect(Collectors.toList());
		return "PetOwner [id=" + id + ", name=" + name + ", pets=" + petNames + "]";
	}	

}
