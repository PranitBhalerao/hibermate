package com.tns.jpa.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritancetest {

	public static void main(String[] args) {
		
		System.out.println("Enter Employee_Name");
		Scanner sc= new Scanner(System.in); 
		String emp_name= sc.next();
		System.out.println("Enter Employee_salary");
		int emp_salary= sc.nextInt(); 
		
		   System.out.println("Enter Manager Name");
		   String Manager_name = sc.next();
		   System.out.println("Enter Manager_salary");
		   int Manager_salary= sc.nextInt(); 
		   System.out.println("Enter Manager DepartmentName ");
		   String Department_Name = sc.next();
		   
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		//System.out.println("1");
		
		//create one employee
		Employee employee = new Employee();  // object : employee
		employee.setName(emp_name);
		employee.setSalary(emp_salary);
		
		em.persist(employee);  // insert
	//	System.out.println("2");
		
		//create one manager
				Manager manager = new Manager();
				manager.setName(Manager_name);
				manager.setSalary(Manager_salary);
				manager.setDepartmentName(Department_Name);
				em.persist(manager);   // insert
				em.getTransaction().commit();
				//System.out.println("3");
				
				
				em.close();
				factory.close();
				
				System.out.println("Added one employee and manager to database.");
	}

}