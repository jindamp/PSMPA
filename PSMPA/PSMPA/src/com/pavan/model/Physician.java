package com.pavan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "physician")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Physician {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "email")
	private String email;
	
	private String password;
	private String profession;
	private String name;
	private String phone_number;
	private String street;
	private String city;
	private String zipcode;
	private String gender;
	private int designation;
	private String status;
	
	
	
	
	
	public Physician() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String getProfession() {
		return profession;
	}




	public void setProfession(String profession) {
		this.profession = profession;
	}




	public int getDesignation() {
		return designation;
	}




	public void setDesignation(int designation) {
		this.designation = designation;
	}




	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
