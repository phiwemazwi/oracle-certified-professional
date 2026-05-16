package com.ocp;

public class Product {
    /*Create a class named `Product`.
    Add a setter method that updates the price field.
    Add another method that prints the price field.
    In the main method, set the price to `249.99`, and print it.*/
    private double price;

    public void updatePrice(double newPrice){
        price = newPrice;
    }

    public void printPrice(){
        System.out.println("Your price is: " + price);
    }
}
