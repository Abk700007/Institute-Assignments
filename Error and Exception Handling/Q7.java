package error_Handling;

	import java.util.*;
	public class Q7 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        int[][] a = {
	            {1, 2},
	            {3, 4}
	        };
	        int[][] b = {
	            {5, 6},
	            {7, 8}
	        };
	        int[][] result = new int[2][2];

	        try {
	            // Matrix multiplication logic
	            for (int i = 0; i < a.length; i++) {  // <= to cause possible ArrayIndexOutOfBounds
	                for (int j = 0; j < b[0].length; j++) { 
	                    for (int k = 0; k < a[0].length; k++) {
	                        result[i][j] += a[i][k] * b[k][j];
	                    }
	                }
	            }

	            // Printing the result
	            System.out.println("Resultant Matrix:");
	            for (int i = 0; i < result.length; i++) {
	                for (int j = 0; j < result[0].length; j++) {
	                    System.out.print(result[i][j] + " ");
	                }
	                System.out.println();
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index problem: " + e.getMessage());
	        }
	    }
	}
