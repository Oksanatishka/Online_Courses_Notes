package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if (gameOver){
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

	    // Challenge

        score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

	    // here you see code duplication so to avoid it we'll consider 'methods' in the next video
		if (gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

    }
}
