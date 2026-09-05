package Session7;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Rectangle(20, 10);
        System.out.println(shape.calculateArea());
        shape.print();
    }
}