package Session5;

import java.util.Scanner;

public class Grades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of grades ");
        grades = new int[scanner.nextInt()];

        getGrades();
        printGrades();

        System.out.println("The average is " + String.format("%.2f", calculateAvg()));
        System.out.println("The highest grade is " + getHighest());
        System.out.println("The Lowest grade is " + getLowest());

        scanner.close();
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade " + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static void printGrades() {
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public static int calculateSum() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    public static double calculateAvg() {
        return (double) calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}