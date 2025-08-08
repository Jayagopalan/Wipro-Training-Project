package com.sampleprograms.java;

import java.util.HashMap;
import java.util.Scanner;

public class WrapperClass {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter number of players: ");
	        int n = sc.nextInt();
	        sc.nextLine(); 

	        String[] players = new String[n];
	        String[] scoreStr = new String[n];

	        
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter name of player " + (i + 1) + ": ");
	            players[i] = sc.nextLine();

	            System.out.print("Enter score for " + players[i] + ": ");
	            scoreStr[i] = sc.nextLine();
	        }

	        
	        HashMap<String, Integer> scores = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            Integer score = Integer.parseInt(scoreStr[i]); 
	            scores.put(players[i], score);
	        }

	     
	        for (int round = 1; round <= 2; round++) {
	            System.out.println("\n Round " + round);
	            for (int i = 0; i < n; i++) {
	                String player = players[i];
	                System.out.print("Enter score to add for " + player + ": ");
	                int scoreToAdd = sc.nextInt();
	                scores.put(player, scores.get(player) + scoreToAdd);
	            }
	        }

	  
	        System.out.println("\n Final Scoreboard ");
	        for (String player : scores.keySet()) {
	            int score = scores.get(player);
	            System.out.println(player + ": " + score + " points");

	            if (score > 20) {
	                System.out.println(player + " has crossed 20 points!");
	            }
	        }

	       
	    }
	}


