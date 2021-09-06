/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package org.example;
import java.util.Scanner;

public class assignment8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people?");
        int people = scan.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = scan.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = scan.nextInt();

        //print out gathered info
        System.out.println( people + " people " + " and " + pizzas + " pizzas (" + slices*pizzas + ")");

        //now do the math
        int slicePerPerson = (pizzas * slices) / people;
        System.out.println("Each person will get " + slicePerPerson + " pieces of pizza.");

        int leftovers = (pizzas * slices) % people;
        System.out.println("There will be " + leftovers + " leftover slices of pizza.");


    }
}
