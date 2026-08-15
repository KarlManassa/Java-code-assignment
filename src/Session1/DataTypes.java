package session1;

public class DataTypes {
    public static void main(String[] args) {
        // int a=5 , b=10 , c=12;     //variable Declaration + initialization
        // a=10;                      //Assignment

        // char a = 'b';
        // String name = "A";

        byte a = 127;
        System.out.println("The byte value is "+a);
        short sh = 32000;
        System.out.println("The short value is "+sh);
        int b = 663633;
        System.out.println("The int value is "+b);
        long l = 217316837231L;
        System.out.println("The long value is "+l);
        float fl = 12821F;
        System.out.println("The float value is "+fl);
        double dbl = 1238.2387642742234;
        System.out.println("The double value is "+dbl);
        boolean bl = true;
        System.out.println("The boolean value is "+bl);
        char grade = 'A';
        System.out.println("The Student grade is "+grade);

        long bigNum = 1239128418184348274L;
        int castedNum = (int)bigNum;
        System.out.println(castedNum);
    }
}