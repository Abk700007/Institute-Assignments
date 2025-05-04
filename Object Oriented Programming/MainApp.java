package Assignment1CSW_2;
class College {
     String collegeName;
     String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College col;

    public Student(int studentId, String studentName,College col) {
        this.studentId = studentId;
        this.studentName = studentName;
        this .col=col; 
        
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + col.collegeName);
        System.out.println("College Location: " + col.collegeLoc);
        System.out.println();
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Create College objects
        College col1 = new College("ABC College", "Mumbai");
        College col2 = new College("XYZ University", "Delhi");

        // Create Student objects and enroll them in colleges
        Student stu1 = new Student(101, "Rahul Sharma",col1);
        Student stu2 = new Student(102, "Priya Mehta",col2);

        // Display student and college details
        System.out.println("Student and College Details:");
        System.out.println("--------------------------------");
        stu1.displayStudentInfo();
        stu2.displayStudentInfo(); 
    }
}

