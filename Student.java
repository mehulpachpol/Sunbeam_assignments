package java_basic;


import java.util.Scanner;

class Student {
    String studentName;
    String rollNo;
    double totalMarks;

    public void inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        this.studentName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        this.rollNo = scanner.nextLine();
        System.out.print("Enter total marks obtained: ");
        this.totalMarks = scanner.nextDouble();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Total Marks Obtained: " + this.totalMarks);
    }



    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Enter student Details");
        student.inputStudentDetails();

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();
    }
}
