package error_Handling;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter an integer to find its square root:");
        int number = in.nextInt();

        try {
            double sqrt = Math.sqrt(number);
            System.out.println("Square root: " + sqrt);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

      
    }
} 