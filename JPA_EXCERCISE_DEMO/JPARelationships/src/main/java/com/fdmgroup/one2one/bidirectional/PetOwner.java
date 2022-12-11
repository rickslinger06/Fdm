package com.fdmgroup.one2one.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PetOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	// OneToOne Bidirectional - added
	@OneToOne(mappedBy = "owner")
	private Pet pet;
	
	PetOwner(){
		// For JPA
	}

	public PetOwner(String name) {
		super();
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
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	@Override
	public String toString() {
		return "PetOwner [id=" + id + ", name=" + name + ", pet=" + (pet == null? null : pet.getName()) + "]";
	}

}
