package com.fdmGroup.presentation;

import java.util.List;

import com.fdmGroup.model.Department;
import com.fdmGroup.model.Employee;
import com.fdmGroup.model.FullTimeEmployee;
import com.fdmGroup.model.PartTimeEmployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import utilities.Helper;

public class Runner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Helper.PERSISTENCE_UNIT_NAME);
		
		Department academy = new Department("Academy");
		Department sales = new Department("Sales");
		
		
		FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", "Trainer",100000);
		FullTimeEmployee emp2 = new FullTimeEmployee("Jane Doe", "Executive",120000);
		PartTimeEmployee pt1 = new PartTimeEmployee("james Smith", "Trainer" ,80);
		
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(academy);
		em.persist(sales);
		em.getTransaction().commit();
		
		Helper.close(em);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(pt1);
		em.getTransaction().commit();
		
		Helper.close(em);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		emp1.setDept(academy);
		emp2.setDept(sales);
		pt1.setDept(academy);
	
		em.merge(emp1);
		em.merge(emp2);
		em.merge(pt1);
		em.getTransaction().commit();
		Helper.close(em);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(emp1);
		em.merge(emp1);
		em.merge(pt1);
		
		em.getTransaction().commit();
		
	
		TypedQuery<Department> findDepartmentquery = em.createNamedQuery("findBydepartment", Department.class);
		Department dept = findDepartmentquery.setParameter("departmentName", "Academy").getSingleResult();
		
		System.out.println(dept);
		
		TypedQuery<Employee> findEmployeeByDep = em.createNamedQuery("findAllEmployeeByDept", Employee.class);
		Department deptAcademy = findDepartmentquery.setParameter("departmentName", "Academy").getSingleResult();
		List<Employee> employees = findEmployeeByDep.setParameter("department", deptAcademy).getResultList();
		
		employees.forEach(e -> System.out.println(e));
			
			
		Helper.close(em);
		
		Helper.close(emf);
	}

}
