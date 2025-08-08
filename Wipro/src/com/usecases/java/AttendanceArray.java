package com.usecases.java;

public class AttendanceArray {
	public static void main(String[] args) {
		int[][] attendance = {
	            {1, 1, 0, 1, 1}, // S1
	            {1, 0, 1, 1, 0}, // S2
	            {0, 1, 1, 1, 1}  // S3
	        };
		int count=0;
		for(int i=0;i<attendance.length;i++) {
			 System.out.print("Student " + (i + 1) + ": ");
			 for(int j=0;j<attendance[i].length;j++) {
				 System.out.print(attendance[i][j] + " ");
			 }
			 System.out.println();
		}
	}

}
