package com.usecases.java;

public class VoterMain {
	public static void main(String[] args) {
		Voter user = new Voter();

		user.setName("Jayagopalan");
		user.setAge(22);

		System.out.println("Name: " + user.getName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Voting Right: " + (user.getVotingRight() ? "Eligible" : "Not Eligible"));

	}
}
