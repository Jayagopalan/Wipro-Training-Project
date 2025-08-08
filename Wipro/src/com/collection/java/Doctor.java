package com.collection.java;

import java.util.Objects;

public class Doctor {

	private String name;
	private String department;
	private String licenseNumber; 

	public Doctor(String name, String department, String licenseNumber) {
		this.name = name;
		this.department = department;
		this.licenseNumber = licenseNumber;
	}

	
	public String getLicenseNumber() {
		return licenseNumber;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Doctor))
			return false;
		Doctor d = (Doctor) obj;
		return this.licenseNumber.equals(d.licenseNumber);
	}


	public int hashCode() {
		return Objects.hash(licenseNumber);
	}


	public String toString() {
		return "Doctor{name='" + name + "', dept='" + department + "', licenseNo='" + licenseNumber + "'}";
	}
}
