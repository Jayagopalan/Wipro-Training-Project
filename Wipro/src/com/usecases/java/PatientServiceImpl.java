package com.usecases.java;

import java.util.HashMap;
import java.util.Map;

public class PatientServiceImpl implements PatientService {
	private Map<Integer, Patients> patientMap = new HashMap<>();

	public void registerPatient(Patients patient) {
		patientMap.put(patient.getId(), patient);
	}

	public void showPatientDetails(int id) {
		Patients p = patientMap.get(id);
		if (p != null) {
			System.out.println("Name: " + p.getName());
			System.out.println("Age: " + p.getAge());
			System.out.println("Illness: " + p.getIllness());
		} else {
			System.out.println("Patient not found.");
		}
	}
}