public class Solution1 {

	public static void main(String[] args) {
		// Write a program to print the numbers from 10 to 50 using for loop/while loop.

		PrintNumbers();
	}
	public static void PrintNumbers() {
        System.out.println("Using for loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nUsing while loop:");
        int i = 10;
        while (i <= 50) {
            System.out.print(i + " ");
            i++;
        }
	}

}
