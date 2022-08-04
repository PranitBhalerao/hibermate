package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setNAME("pranit");
		
		Address homeAddress = new Address();
		homeAddress.setAddress_Street("sai darsrshan");
		homeAddress.setAddress_City("vasai");
		homeAddress.setAddress_State("maharashtra");
		homeAddress.setAddress_ZipCode(401208);

		//inject address into student table
		student.setAddress(homeAddress);
		
		em.persist(student);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		System.out.println("Added one employee and manager to database.");
	}

}