package com.ocp;

public class Person {

    /*
    *1. Create a class named Person.
     2. Add a setter method that updates the name field.
     3. Add another method that prints the name field.
     4. In the main method, set the name to "John", and print it.

    * */

    private String name;

    public void setName(String newName){
        name = newName;
    }

    public void printName(){
        System.out.println("Hi " + name);
    }


}
