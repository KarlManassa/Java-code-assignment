package javaAssignment;

import java.util.Scanner;

/**
 * A console application that provides options to analyze and perform
 * calculations on numbers using methods and interactive menus.
 */
public class NumberAnalyzer {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice;

        do {
            displayMenu();
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    printNumbersDescending();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int inputNum = scanner.nextInt();
                    String resultType = checkNumberType(inputNum);
                    System.out.println(resultType);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int sum = calculateSum(num1, num2);
                    System.out.println("Sum = " + sum);
                    break;
                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println();
        } while (userChoice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("=========================");
        System.out.println("   Number Analyzer Menu  ");
        System.out.println("=========================");
        System.out.println("1 - Print Numbers 10 to 1");
        System.out.println("2 - Print Even/Odd Report");
        System.out.println("3 - Check Number Type");
        System.out.println("4 - Calculate Sum Between Two Numbers");
        System.out.println("5 - Exit");
        System.out.println("=========================");
        System.out.print("Enter your option: ");
    }

    /**
     * Prints integers starting from 10 down to 1 in descending order.
     */
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + (i > 1 ? " " : "\n"));
        }
    }

    /**
     * Iterates through numbers from 1 to 10 and prints whether each is Even or Odd.
     */
    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * Determines whether the given integer is positive, negative, or zero.
     *
     * @param number The integer value to be evaluated.
     * @return A string with the category name: "Positive", "Negative", or "Zero".
     */
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two integer values and returns the sum.
     *
     * @param number1 The first integer input.
     * @param number2 The second integer input.
     * @return The arithmetic addition of number1 and number2.
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
}