package Session3;

import java.util.Scanner;

public class Greeting {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);

        String name2 = getUserName();
        greetUser(name2);

        scanner.close();
    }

    static String getUserName() {
        System.out.println("Enter Your Name : ");
        return scanner.nextLine();
    }

    static void greetUser(String name) {
        System.out.println("Hello " + name);
    }
}