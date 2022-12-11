package com.fdmgroup.one2one.bidirectional;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String species;
	@Column(name = "CAN_PROTECT")
	private boolean canProtect;
	@OneToOne(cascade = {CascadeType.ALL}) 
	private PetOwner owner;


	Pet(){
		// For JPA
	}
	public Pet(String name, String species, boolean canProtect) {
		super();
		this.name = name;
		this.species = species;
		this.canProtect= canProtect;
	}
	public PetOwner getOwner() {
		return owner;
	}
	public void setOwner(PetOwner owner) {
		this.owner = owner;
	}

	public long getId() {
		return id;
	}
	public boolean isCanProtect() {
		return canProtect;
	}
	public void setCanProtect(boolean canProtect) {
		this.canProtect = canProtect;
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", canProtect=" + canProtect + ", owner=" + (owner == null ? null : owner)
				+ "]";
	}
	
}
