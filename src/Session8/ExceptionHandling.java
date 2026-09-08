package Session8;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
    public static void main(String[] args) {
        createNewFile();
        numbersExceptionHandling();
        try {
            createFileRethrow();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello After Exception 2");
    }

    public static void createNewFile() {
        File file = new File("resources/text.txt");
        try {

            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }

            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Directory does not exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello After Exception");
    }

    public static void createFileRethrow() throws IOException {
        File file = new File("resourcess/text.txt");
        file.createNewFile();
        System.out.println("Hello After Exception");
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/aaa.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Hello from after exception");
    }
}