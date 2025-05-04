package cswassignTWO;

import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private int totalMark;

    public Student(String name, int rollNumber, int totalMark) {
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

    // compareTo method to compare students by roll number
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNumber, s.rollNumber);
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll Number=" + rollNumber + ", Total Marks=" + totalMark + "]";
    }
}

public class Q5 {
    
    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) { 
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

       
        System.out.println("Enter the Name, Roll Number, and Total Marks of 5 Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = sc.next();
            int rollNumber = sc.nextInt();
            int totalMark = sc.nextInt();
            students[i] = new Student(name, rollNumber, totalMark);
        }

        System.out.println("\nStudents Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        
        bubbleSort(students);

        System.out.println("\nStudents After Sorting by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
