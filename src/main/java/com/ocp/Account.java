package com.ocp;

public class Account {

    /*Create a class named `Account`.
    Add a setter method that updates the active status field.
    Add another method that prints the active status field.
    In the main method, set the active status to `true`, and print it.*/

    private Boolean status;

    public void updateStatus(Boolean newStatus){
        status = newStatus;
    }

    public void printStatus(){
        System.out.println("Your account status is: " + status);
    }
}
