package com.Studata.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class studentmodels {
	
	
	@Id  //(primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // for auto increment
	@Column
	private int id;

	@Column
	private String fullname;
	
	@Column
	private String email;	
	
	
	@Column
	private String location;
	
	@Column
	private long phone;
	
	@Column
	private String school;
	
	@Column
	private int pincode;

	
		
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	

	public studentmodels(int id, String fullname, String email, String location, long phone, String school,
			int pincode) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.location = location;
		this.phone = phone;
		this.school = school;
		this.pincode = pincode;
	}

	public studentmodels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
