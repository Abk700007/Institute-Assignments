package error_Handling;
//Custom checked exception class
class CustomCheckedException extends Exception {
 CustomCheckedException(String message) {
     super(message);
 }
}

public class Q8 {
 public static void main(String[] args) {
     try {
         int number = -5;

         if (number < 0) {
             throw new CustomCheckedException("Negative numbers are not allowed!");
         }
         
         System.out.println("Number is valid: " + number);

     } catch (CustomCheckedException e) {
         System.out.println("Caught exception: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }
}
