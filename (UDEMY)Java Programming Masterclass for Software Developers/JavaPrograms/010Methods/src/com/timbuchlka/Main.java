package com.timbuchlka;

public class Main {
    // method main
    public static void main(String[] args) {

        // calculateScore(true, 800, 5,100);
        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("Your final score was " + highScore);
        // calculateScore(true, 10000, 8, 200);
        highScore = calculateScore(true, 10000, 8,200);
        System.out.println("Your final score was " + highScore);


        // calling methods from Challenge
        int pos = calculateHighScorePosition(1500);
        displayHighScorePosition("Oksana", pos);
        pos = calculateHighScorePosition(900);
        displayHighScorePosition("Serhii", pos);
        pos = calculateHighScorePosition(400);
        displayHighScorePosition("Max", pos);
        pos = calculateHighScorePosition(50);
        displayHighScorePosition("Denis", pos);
    }

    // method calculateScore
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else
            return -1;
    }

    // Challenge


    public static void displayHighScorePosition(String playersName, int playerPosition){
        System.out.println(playersName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000)
//            return 1;
//        else if (playerScore >= 500)
//            return 2;
//        else if (playerScore >= 100)
//            return 3;
//
//        return 4;

        // Another implementation of the if statement
        int position = 4;
        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;

        return position;
    }
}
