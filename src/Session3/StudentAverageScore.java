package Session3;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        int numberOfStudents = 2;
        int numberOfCourses = 3;
        Scanner scanner = new Scanner(System.in);

        // get what we need
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfCourses; j++) {
                System.out.println("Enter the grade of course " + (j + 1) + " for student " + (i + 1));
                double score = scanner.nextDouble();
                total += score;
            }
            System.out.println("The average score of student " + (i + 1) + " is " + (total / numberOfCourses));
        }

        scanner.close();
    }
}