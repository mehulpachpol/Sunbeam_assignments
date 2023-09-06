package java_basic;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for five subjects:");

        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        int totalMarks = (subject1 + subject2 + subject3 + subject4 + subject5)/5;

        char grade;

        if (totalMarks >= 90) {
            grade = 'A';
        } else if (totalMarks >= 80) {
            grade = 'B';
        } else if (totalMarks >= 70) {
            grade = 'C';
        } else if (totalMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

