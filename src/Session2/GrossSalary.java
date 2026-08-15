package Session2;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        // What we have
        int rate = 15;
        int maxWeeklyHours = 40;

        // What we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter working hours : ");
        double workingHours = scanner.nextDouble();

        // Validation
        while (workingHours > maxWeeklyHours || workingHours < 1) {
            System.out.println("Please Enter Value between 1 and 40 ");
            workingHours = scanner.nextDouble();
        }

        scanner.close();

        // Calculations
        double grossSalary = workingHours * rate;
        System.out.println("The gross salary is " + grossSalary + " $");

    }
}
