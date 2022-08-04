package com.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();  // object : employee
		employee.setName("pranit");
		employee.setSalary(1566);	
		em.persist(employee); 
	
		Manager manager = new Manager();
		manager.setName("Bhale");
		manager.setSalary(2356);
		manager.setDepartmentName("IT");
		em.persist(manager);   // insert
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		System.out.println("done");		
	}

}