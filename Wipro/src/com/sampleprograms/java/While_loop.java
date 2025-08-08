package com.sampleprograms.java;
import java.util.Scanner;
public class While_loop {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	int number;
	do {
		System.out.println("Enter a positive number ");
		number = sc.nextInt();
	}while(number<=0);
	System.out.println("You entered "+number);
}

}
