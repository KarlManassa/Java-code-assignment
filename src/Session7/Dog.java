package Session7;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void bite() {
        System.out.println("I am a dog , I bite");
    }
}
