package com.ocp;

public class Player {
    /*Create a class named `Player`.
    Add a setter method that updates the score field.
    Add another method that prints the score field. In the main method,
    set the score to `95`, and print it.*/

    private int score;

    public void updateScore(int newScore){
        score = newScore;
    }

    public void printScore(){
        System.out.println("You score is: " + score);
    }

}
