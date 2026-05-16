package com.ocp;

public class Student {
    /*Create a class named `Student`.
    Add a setter method that updates the student name field.
    Add another method that prints the student name field. In the main method, set the student name to `"Bunna"`,
    and print it.*/

    private String name;

    public void updateSudentName(String newName){
        name = newName;
    }

    public void printName(){
        System.out.println("Your nickname is: "+name);
    }
}
