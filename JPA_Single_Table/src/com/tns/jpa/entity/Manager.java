package com.tns.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name="mgr_store")
public class Manager extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -749410526826476802L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
