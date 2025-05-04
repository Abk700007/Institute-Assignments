package cswassignTWO;
import java.util.*;
class Student<T>{
	private String name;
	private T rollNumber;
	private int age;
	Student(String name,T rollNumber,int age)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.age=age;
	}
	String getName()
	{ 
		return name;
	}
	T getRollNumber()
	{
		return rollNumber;
	}
	int getAge()
	{
		return age;
	}
} 
public class Q1{ 
   public static void main(String[] args) {
	   Student<Integer> ob1 = new Student("Rohan",20,25); 
	   Student<String>  ob2 = new Student("Rohit","A2E3",28); 
	   System.out.println("rollNumber variable accepting as Integer");
	   System.out.println("Name : "+ob1.getName()+"\nRoll Number : "+ob1.getRollNumber()+"\nAge : "+ob1.getAge());
	   System.out.println("\nrollNumber variable accepting as String");
	   System.out.println("Name : "+ob2.getName()+"\nRoll Number : "+ob2.getRollNumber()+"\nAge : "+ob2.getAge()); 
	   
	   
	}
}
