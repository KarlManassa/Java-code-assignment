package Session4;

import java.util.Scanner;

public class InstantPayCheck {

    static double requiredSalary = 20000;
    static double requiredCreditScore = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getEmployeeSalary();
        double creditScore = getEmployeeCreditScore();

        boolean qualified = isQualified(salary, creditScore);
        notifyUser(qualified);

        scanner.close();
    }

    static double getEmployeeSalary() {
        System.out.println("Enter Your Salary ");
        return scanner.nextDouble();
    }

    static double getEmployeeCreditScore() {
        System.out.println("Enter Your Credit Score ");
        return scanner.nextDouble();
    }


    static boolean isQualified(double salary, double creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats , you are qualified for the loan");
        } else {
            System.out.println("Sorry , You are not qualified for the loan");
        }
    }
}