package error_Handling;
import java.util.*;
public class Q1 {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a string");
  String s=in.nextLine();char ch;int c=0;
  if(s==null||s.isEmpty())
  throw new NullPointerException("Input String is empty");
  for(int i=0;i<s.length();i++)
  {
	ch=s.charAt(i);
	if(Character.isDigit(ch))
	{ 
		c=1;
		System.out.println(ch);
	}
  }
  if(c==0)
	  System.out.println("No numeric character present in the string");
	}
}
