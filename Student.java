import java.util.Scanner;
import java.util.*;

public class Student {
    private String name;
    private int enrollmentNumber;

    public Student(String name) {
        this.name = name;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public String toString() {
        return "Student Name: " + name + ", Enrollment Number: " + enrollmentNumber;
    }
}

public class StudentRegistrationSystem {
    private static int enrollmentNumber = 1;
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter student name (or 'quit' to exit): ");
            String name = scanner.nextLine();
            if (name.equals("quit")) {
                break;
            }
            registerStudent(name);
        }

        while (true) {
            System.out.print("Enter enrollment number to retrieve student info (or 'quit' to exit): ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            int enrollmentNumber = Integer.parseInt(input);
            System.out.println(getStudentInfo(enrollmentNumber));
        }
    }

    public static void registerStudent(String name) {
        Student student = new Student(name);
        student.setEnrollmentNumber(enrollmentNumber);
        studentList.add(student);
        enrollmentNumber++;
    }

    public static String getStudentInfo(int enrollmentNumber) {
        for (Student student : studentList) {
            if (student.getEnrollmentNumber() == enrollmentNumber) {
                return student.toString();
            }
        }
        return "No student found with enrollment number " + enrollmentNumber;
    }
}
