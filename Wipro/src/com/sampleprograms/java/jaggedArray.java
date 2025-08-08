package com.sampleprograms.java;
import java.util.Arrays;
public class jaggedArray {
	public static void main(String[] args) {
		int[][] storage = {
	            {100, 200},           
	            {150, 120, 80},       
	            {90}                  
	        };
		for (int i = 0; i < storage.length; i++) {
            System.out.println("Warehouse " + (i + 1) + ":");
            int total = 0;
            for (int j = 0; j < storage[i].length; j++) {
                System.out.println("  Rack " + (j + 1) + ": " + storage[i][j] + " items");
                total += storage[i][j];
            }
            System.out.println("  ➤ Total items: " + total + "\n");
        }
	}

}
