package session1;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 20, b = 10;

        System.out.println("The addition of a and b is " + (a + b));        //30
        System.out.println("The subtract of a and b is " + (a - b));        //10
        System.out.println("The multiplication of a and b is " + (a * b));  //200
        System.out.println("The division of a and b is " + (a / b));        //2
        System.out.println("The remainder of a divided by b is " + (a % b)); //0

        // Relational/Comparison Operators
        System.out.println(a > b);   //true
        System.out.println(a >= b);  //true
        System.out.println(a < b);   //false
        System.out.println(a <= b);  //false
        System.out.println(a == b);  //false
        System.out.println(a != b);  //true

        // Logical operators      &&    ||    !
        boolean x = true, y = false;

        System.out.println(x && y);   //false
        System.out.println(x || y);   //true
        System.out.println(!x);       //false
        System.out.println(!y);       //true

        // Increment/Decrement Operators
        a = 10; // إعادة استخدام a بدون int
        b = a--; // إعادة استخدام b بدون int
        System.out.println(a); // 9
        System.out.println(b); // 10

        // Assignment Operators
        a = 10;
        a += 5;    //a=a+5 15
        a -= 5;    //a=a-5 10
        a *= 5;    //a=a*5 50
        a /= 5;    //a=a/5 10
        a %= 5;    //a=a%5 0
        System.out.println(a);

        // Ternary Operator / Conditional Statement
        int age = 20;
        // var = exp ? true : false
        String status;
        // status = (age > 18) ? "Eligible" : "Not Eligible";
        // System.out.println(status);

        if (age > 18) {
            status = "Elgible";
        } else {
            status = "Not Eligible";
        }
        System.out.println(status); // تعديل S إلى Capital
    }
}