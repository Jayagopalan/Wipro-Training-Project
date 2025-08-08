package com.usecases.java;

public class Voter {
	private String name;
	private int age;
	private boolean canVote;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
		if (age >= 18) {
			canVote = true;
		} else {
			canVote = false;
		}
	}

	public int getAge() {
		return age;
	}

	public boolean getVotingRight() {
		return canVote;
	}
}
