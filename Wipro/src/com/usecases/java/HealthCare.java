package com.usecases.java;

public class HealthCare {
	public static void main(String[] args) {

		PatientService service = new PatientServiceImpl();

		Patients p1 = new Patients(1, "Jayagopalan", 30, "Fever");
		Patients p2 = new Patients(2, "Kansiya", 25, "ThroatPain");

		service.registerPatient(p1);
		service.registerPatient(p2);

		service.showPatientDetails(1);

		Doctor doctor = new GeneralPhysician("Dr.Kuttipal");

		doctor.diagnose(p1);
		doctor.diagnose(p2);
	}

}
