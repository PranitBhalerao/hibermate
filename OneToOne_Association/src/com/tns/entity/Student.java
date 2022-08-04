package com.tns.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Student implements Serializable {

	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int STUDENTID;
	
	
	
	private String NAME ;
	
	
	@OneToOne(cascade=CascadeType.ALL)

	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public int getSTUDENTID() {
		return STUDENTID;
	}

	public void setSTUDENTID(int sTUDENTID) {
		STUDENTID = sTUDENTID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
	
	
}