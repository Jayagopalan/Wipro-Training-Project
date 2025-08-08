package com.sampleprograms.java;

public class stringBuffer {
	public static void main(String[] args) {
		  StringBuffer receipt = new StringBuffer();
	        
	        receipt.append("Receipt\n");
	        receipt.append("Customer : Jayagopalan\n");
	        receipt.append("Items: \n");
	        receipt.append("1. Paracetamol - 30\n");
	        receipt.append("2. Vitamin C - 60\n");
	        receipt.append("3. Cough Syrup - 120\n");
	        receipt.append("Total: 210\n");
	        receipt.append("Thank You for Visiting!");
	        
	        int start = receipt.indexOf("Vitamin C");
	        int end = start + "Vitamin C".length();
	        receipt.replace(start, end, "Dolo 650");
	        
	        receipt.setCharAt(receipt.indexOf("T"), 't');

	        System.out.println(receipt);
	}

}
