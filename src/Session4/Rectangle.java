package Session4;

public class Rectangle {

    private double length;
    private double width;
    private static int counter;

    public Rectangle() {
        counter++;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Rectangle.counter = counter;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Setting default value to 10.");
            this.length = 10;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Setting default value to 5.");
            this.width = 5;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}