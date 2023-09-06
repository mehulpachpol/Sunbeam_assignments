package java_basic;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 10;

        System.out.print("Enter the number of students (up to " + MAX_STUDENTS + "): ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        if (numStudents > MAX_STUDENTS) {
            System.out.println("Number of students exceeds the maximum allowed.");
            return;
        }

        String[] nameOfStudents = new String[numStudents];

        // Read student names
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            nameOfStudents[i] = scanner.nextLine();
        }

        // Sort the array of names
        Arrays.sort(nameOfStudents);

        // Display sorted names
        System.out.println("\nSorted Names:");
        for (String studentName : nameOfStudents) {
            System.out.println(studentName);
        }
    }
}

