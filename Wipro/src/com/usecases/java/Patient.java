package com.usecases.java;

public class Patient {

	private String name;
	private int age;
	private String diagnosis;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void displayRecord() {
		System.out.println("\nPatient Summary:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Diagnosis: " + diagnosis);

	}

}
