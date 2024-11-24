package com.example;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// Write a program that find a given number is negative or positive.
		NumberCheck();
	}
	public static void NumberCheck() {
        Scanner obj = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        double number = obj.nextDouble();

        // Check if positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
	
	
}
