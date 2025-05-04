package cswassignTWO;
import java.util.*;
class Student1 implements Comparable <Student1>
{
	private String name;
	private int rollNumber;
	private int totalMark;
	public Student1(String name, int rollNumber, int totalMark) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMark = totalMark;
	}
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public int getTotalMark() {
		return totalMark;
	}
    public int compareTo(Student1 s)
    {
    	return Integer.compare(this.getRollNumber(), s.getRollNumber());
    }
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", totalMark=" + totalMark + "]";
	}	 
}
public class Q4 {

	public static void main(String[] args) {
		Student1 ob[]=new Student1[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name,rollnumber,total mark of 5 students");
		for(int i=0;i<5;i++)
		{
			ob[i]=new Student1(in.next(),in.nextInt(),in.nextInt());
		}
		System.out.println("Enter search Roll Number");
		int se=in.nextInt();
		for(int i=0;i<5;i++)
		{
			if(ob[i].getRollNumber()==se)
			{
				System.out.println("Student found");
				System.out.println("Name : "+ob[i].getName());
				System.out.println("Roll Number : "+ob[i].getRollNumber());
				System.out.println("Total Mark : "+ob[i].getTotalMark());
			}
		}
		System.out.println("Students sorted according to roll number");
		Arrays.sort(ob);
		for(int i=0;i<5;i++)
		{
			System.out.println(ob[i]); 
		}
	}

}
