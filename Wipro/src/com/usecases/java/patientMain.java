package com.usecases.java;

public class patientMain {
	public static void main(String[] args) {
		Patient p1 = new Patient();

		p1.setName("Jayagopalan");
		p1.setAge(22);
		p1.setDiagnosis("Fever");

		p1.displayRecord();

	}

}
