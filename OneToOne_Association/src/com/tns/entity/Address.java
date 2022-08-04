package com.tns.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
@Entity
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Address_Id;
	private String Address_Street;
	private String Address_City;
	private String Address_State;
	private int Address_ZipCode;
	
	
	public int getAddress_Id() {
		return Address_Id;
	}
	public void setAddress_Id(int address_Id) {
		Address_Id = address_Id;
	}
	public String getAddress_Street() {
		return Address_Street;
	}
	public void setAddress_Street(String address_Street) {
		Address_Street = address_Street;
	}
	public String getAddress_City() {
		return Address_City;
	}
	public void setAddress_City(String address_City) {
		Address_City = address_City;
	}
	public String getAddress_State() {
		return Address_State;
	}
	public void setAddress_State(String address_State) {
		Address_State = address_State;
	
	}
	public int getAddress_ZipCode() {
		return Address_ZipCode;
	}
	public void setAddress_ZipCode(int address_ZipCode) {
		Address_ZipCode = address_ZipCode;
	}
	
}