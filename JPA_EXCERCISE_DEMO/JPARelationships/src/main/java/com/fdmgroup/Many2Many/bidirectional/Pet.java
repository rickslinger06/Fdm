package com.fdmgroup.Many2Many.bidirectional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/*
 * Many pets to Many owners - both know about each other
 */
@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String species;
	@Column(name = "CAN_PROTECT")
	private boolean canProtect;
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}) 
	private List<PetOwner> owners;
	
	Pet(){
		// For JPA
		owners = new ArrayList<>();
	}
	public Pet(String name, String species, boolean canProtect) {
		super();
		this.name = name;
		this.species = species;
		this.canProtect= canProtect;
		owners = new ArrayList<>();
	}

	public List<PetOwner> getOwners() {
		return owners;
	}
	public void setOwners(List<PetOwner> owners) {
		this.owners = owners;
	}
	public boolean isCanProtect() {
		return canProtect;
	}
	public void setCanProtect(boolean canProtect) {
		this.canProtect = canProtect;
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		List<String> ownerNames = owners.stream().map(e -> e.getName()).collect(Collectors.toList());
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", canProtect=" + canProtect + ", owner=" + 
				ownerNames + "]";
	}
	
	
}
