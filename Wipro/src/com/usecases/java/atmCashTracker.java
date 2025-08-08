package com.usecases.java;

public class atmCashTracker {
	public static void main(String[] args) {
		 int[][] cash = {
		            {10, 20, 30},
		            {5,  25, 40}, 
		            {8,  15, 20}  
		        };
		 System.out.println("ATM Cash Tracker (Note Count):");
		 System.out.println();
		 System.out.println("Notes\t500\t200\t100");
		 for(int i=0;i<cash.length;i++) {
			 System.out.print("ATM " + (i + 1) + "\t");
			 for(int j=0;j<cash[i].length;j++) {
				 System.out.print(cash[i][j] + "\t");
			 }
			 System.out.println();
		 }
	}

}
