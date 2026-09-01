package Session6;

public class Person {
    private int age;
    private String name;
    private String address;

//    public Person() {
//        System.out.println("I am Person Default Constructor");
//    }

    public Person(String name) {
        this.name = name;
        System.out.println("I am Person Parameterized Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
