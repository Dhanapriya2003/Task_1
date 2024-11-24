package com.example;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// Write down the program to reverse the given number using loops. Input = 876 Output -678
		ReverseNumber();
	}
	public static void ReverseNumber() {

		Scanner obj = new Scanner(System.in);

        String input = obj.next();

        // Reverse the string using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }

}
