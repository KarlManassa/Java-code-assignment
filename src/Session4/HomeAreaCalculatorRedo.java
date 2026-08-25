package Session4;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo home = new HomeAreaCalculatorRedo();

        Rectangle kitchen = home.getRoomDimensions();

        Rectangle bathroom = home.getRoomDimensions();

        double totalArea = home.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is " + totalArea);

        home.scanner.close();
    }

    Rectangle getRoomDimensions() {
        System.out.println("Please Enter Room Length ");
        double length = scanner.nextDouble();

        System.out.println("Please Enter Room Width ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    double calculateTotalArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}