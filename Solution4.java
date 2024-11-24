import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		//  Write a java program to Find the smallest number among three numbers.

		SmallestNumber();
	}

	public static void SmallestNumber() {
        Scanner obj = new Scanner(System.in);

        // Input three numbers
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        // Find the smallest number
        
        if (num1 < num2 & num1 < num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 < num3 & num2 < num1) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }

    }
}
