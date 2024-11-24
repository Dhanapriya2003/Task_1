public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a java program to print bellowed pattern ->i and j and k=>5
//
//				55555
//
//				54444
//
//				54333
//
//				54322
//
//				54321
		PatternPrint();
	}
	public static void PatternPrint() {
		int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    // Print the row number for columns before the diagonal
                    System.out.print(n - i + 1);
                } else {
                    // Print the column value for remaining part
                    System.out.print(n - j + 1);
                }
            }
            System.out.println(); // Move to the next row
        }
    }

}
