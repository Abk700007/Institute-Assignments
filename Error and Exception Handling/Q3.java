package error_Handling;
import java.util.*;
public class Q3 {
	public static void stringtointeger(String s)
	{
		try {
			int n=Integer.parseInt(s);
			System.out.println("String converted to integer : "+n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valid numeric value");
			Scanner in=new Scanner(System.in);
			stringtointeger(in.nextLine());
		} 
	}
	public static void main(String[] args) {
    String s="a1234";
    stringtointeger(s);
	}
} 
