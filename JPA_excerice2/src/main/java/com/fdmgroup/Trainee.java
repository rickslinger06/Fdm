package com.fdmgroup;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;

@Entity
@NamedQuery(name = "findTraineeByStream", query = "Select t FROM Trainee t WHERE t.stream = :stream")
public class Trainee {
	
	@SequenceGenerator(name= "seq_Trainee",sequenceName="Trainee_id_seq", initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_Trainee")
	@Id
	private int id;
	@Column(updatable = false)
	private String firstName;
	@Column(updatable = false)
	private String lastName;
	
	@JoinColumn(name = "fk_stream_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Stream stream;

	public Trainee() {}
	
	public Trainee(String firstName, String lastName) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	
	

}
