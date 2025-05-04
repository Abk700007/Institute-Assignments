package cswassignTWO;
import java.util.Arrays;
import java.util.Comparator;

class Student2 {
    private String name;
    private int rollNo;
    private int age;

    public Student2(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student2 [Name=" + name + ", RollNo=" + rollNo + ", Age=" + age + "]";
    }
}

// Comparator to sort students by Roll Number
class RollNoComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}

// Comparator to sort students by Age
class AgeComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Creating an array of Student2 objects
        Student2[] students = {
            new Student2("Alice", 102, 20),
            new Student2("Bob", 104, 19),
            new Student2("Charlie", 103, 22),
            new Student2("David", 105, 21)
        };

        // Sorting by Roll Number
        Arrays.sort(students, new RollNoComparator());
        System.out.println("Students sorted by Roll Number:");
        for (Student2 s : students) {
            System.out.println(s);
        }

        // Sorting by Age
        Arrays.sort(students, new AgeComparator());
        System.out.println("\nStudents sorted by Age:");
        for (Student2 s : students) {
            System.out.println(s);
        }
    }
}
