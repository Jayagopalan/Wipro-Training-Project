package com.usecases.java;

public class GeneralPhysician extends Doctor {
    public GeneralPhysician(String name) {
        super(name, "General");
    }

    public void diagnose(Patients patient) {
        System.out.println("General diagnosis for " + patient.getName() + ": " + patient.getIllness());
    }
}
