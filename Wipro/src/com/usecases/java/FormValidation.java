package com.usecases.java;

public class FormValidation {
	public static void main(String[] args) {
		String name = "Arjun";
        String ageInput = "23";
        String marksInput = "85.5";
        String salaryInput = "35000.75";
        
        int age = Integer.parseInt(ageInput);               
        double marks = Double.parseDouble(marksInput);      
        float salary = Float.parseFloat(salaryInput);       
       
        boolean isAgeValid = age >= 18 && age <= 60;
        boolean isMarksValid = marks >= 40 && marks <= 100;
        boolean isSalaryValid = salary >= 10000;
    

        boolean isFormAccepted = isAgeValid && isMarksValid && isSalaryValid;

      
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " (Valid: " + isAgeValid + ")");
        System.out.println("Marks: " + marks + " (Valid: " + isMarksValid + ")");
        System.out.println("Salary: ₹" + salary + " (Valid: " + isSalaryValid + ")");

        System.out.println(isFormAccepted ? "Form Accepted" :  "Form Rejected");
	}
	

}
