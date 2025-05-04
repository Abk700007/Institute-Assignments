package error_Handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Q9 {
    public static void main(String[] args) {
        readInteger();
    }

    public static void readInteger() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        System.out.println("Program continues...");
    }
}
