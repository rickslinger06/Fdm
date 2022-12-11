package com.fdmgroup.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// Specify query in the class that is it related to
@NamedQuery(name = "readAllPets", query = "SELECT p FROM Pet p")
@NamedQuery(name = "findPetByName", query = "SELECT p FROM Pet p WHERE p.name LIKE :petName")
@Entity // Needed for entity
@Table (name = "Pet_Table")
public class Pet {

	@Id  // Needed for entity
//	@GeneratedValue(strategy = GenerationType.AUTO) // Does not have a value until it is first persisted
		// Default value is 0
	// Creating unique sequence 
	@SequenceGenerator(name = "seq_pet", sequenceName="pet_id_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq_pet")
	private long id;
	@Column(name = "Pet_Name")
	private String name;
	private String species;
	@Transient // not a column in the database
	private String breed;
	@Column(name = "can_protect") // changing how the name will appear in the column
	private boolean canProtect;
	
	Pet() {
		// FOR JPA
		// Needed for entity
	}
	
	public Pet(String name, String species, String breed, boolean canProtect) {
		super();
		this.name = name;
		this.species = species;
		this.breed = breed;
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isCanProtect() {
		return canProtect;
	}
	public void setCanProtect(boolean canProtect) {
		this.canProtect = canProtect;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + (canProtect ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (canProtect != other.canProtect)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", breed=" + breed + ", canProtect="
				+ canProtect + "]";
	}
	
	
	
}
