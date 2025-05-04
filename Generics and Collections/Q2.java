package cswassignTWO;
import java.util.*;
class Book
{
	private String bookId;
	private String bookName;
	private double price;
	Book(String bookId,String bookName,double price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	public String getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [Book Id=" + bookId + ", Name=" + bookName + ", Price=Rs" + price + "]";
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Book book = (Book) obj;
	        return Double.compare(price, book.price) == 0; 
	    }
}
public class Q2 {
	public static void main(String[] args) { 
		Book ob1=new Book("ABK700007","The Power of Habit",250);
		Book ob2=new Book("HBK100001","A Brief History of Time",200);
		if(ob1.equals(ob2))
		   System.out.println("Both books have same price");  
		else {
		 if(ob1.getPrice()>ob2.getPrice())
			System.out.println(ob1.getBookName()+" book is expensive");
		else 
			System.out.println(ob2.getBookName()+" book is expensive"); 
		}
		System.out.println("Details of Book 1 :");
		System.out.println(ob1);
		System.out.println("Details of Book 2 :");
		System.out.println(ob2);	
	}
}
