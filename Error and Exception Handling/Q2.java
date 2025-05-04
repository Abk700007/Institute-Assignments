package error_Handling;
//CustomNullPointerException.java
 class CustomNullPointerException extends Exception {
 
 // Constructor that accepts a custom error message
 public CustomNullPointerException(String message) {
     super(message);  // Pass the message to the parent class (RuntimeException)
 }
} 
//Main.java
public class Q2 {
 public static void main(String[] args) {
         String s = null;
         try {
         if (s == null) {
             // Throw the custom exception with a custom message
             throw new CustomNullPointerException("Custom Error: Null reference encountered!");
         }
         }
         catch(CustomNullPointerException e)
         {
        	 System.out.println(e.getMessage());
         }
}
}
