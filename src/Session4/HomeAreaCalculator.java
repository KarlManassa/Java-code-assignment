package Session4;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        System.out.println("Counter is " + Rectangle.getCounter());

        room1.setLength(20);
        room1.setWidth(10);

        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of room 1 is " + areaOfRoom1);

        Rectangle room2 = new Rectangle(30, 20);
        System.out.println("Counter is " + Rectangle.getCounter());

        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The area of room 2 is " + areaOfRoom2);

        System.out.println("The total area is " + (areaOfRoom1 + areaOfRoom2));
    }
}
