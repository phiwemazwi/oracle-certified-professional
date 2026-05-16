package com.ocp;

public class Grade {

    /*
    * Create a class named `Grade`.
    * Add a setter method that updates the grade symbol field.
    * Add another method that prints the grade symbol field.
    * In the main method, set the grade symbol to `'A'`, and print it.*/

    private String grade;

    public void setGrade(String newGrade){
        grade = newGrade;
    }

    public void printGrade(){
        System.out.println("Your grade is " + grade);
    }
}
