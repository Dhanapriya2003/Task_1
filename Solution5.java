package com.example;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		//  Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.

		//	1. If the purchase amount is less than 500, no discount is applied.
		//
		//	2. If the purchase amount is between 500 and 1000, a 10% discount is applied. 
		//			
		//	3. If the purchase amount is greater than 1000 a 20% discount is applied.

		DiscountCalculator();
		
	}
	
	public static void DiscountCalculator() {
        Scanner obj = new Scanner(System.in);

        double purchaseAmount = obj.nextDouble();

        // Calculate discount
        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
        	double discount = 0.10 * purchaseAmount;
        	double finalAmount = purchaseAmount - discount;
        	System.out.println("Final Payable Amount: " + finalAmount);
        } else if (purchaseAmount > 1000) {
        	double discount = 0.20 * purchaseAmount;
        	double finalAmount = purchaseAmount - discount;
        	System.out.println("Final Payable Amount: " + finalAmount);
        }else {
        	double discount = 0 * purchaseAmount;	
        	double finalAmount = purchaseAmount - discount;
        	System.out.println("Final Payable Amount: " + finalAmount);
        }
        
        
    }
}
