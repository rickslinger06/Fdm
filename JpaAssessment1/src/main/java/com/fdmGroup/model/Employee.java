package com.fdmGroup.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "findAllEmployeeByDept", query = "Select e FROM Employee e WHERE e.dept = :department")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Employee_ID_GEN")
	@SequenceGenerator(name = "Employee_ID_GEN", sequenceName = "Employee_ID_SEQ")
	@Column(name = "emp_id", nullable = false)
	private int empId;
	@Column(name = "emp_name", updatable = false, nullable = false)
	private String empName;

	@Column(name = "emp_designation", nullable = false)
	private String empDesignation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_dept_d")
	private Department dept;

	public Employee(String empName, String empDesignation) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + ", dept="
				+ dept + "]";
	}
	
	
	

}
