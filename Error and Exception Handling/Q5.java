package error_Handling;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String and a number");

        String s = in.nextLine();
        int number = in.nextInt();
        try { 
            int no=Integer.parseInt(s);
           System.out.println("conerted : "+no);
            try {
                // This block may throw ArithmeticException
                int result =number / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } catch (NumberFormatException e) {
            System.out.println(e); 
        }

        in.close();
    }
}
