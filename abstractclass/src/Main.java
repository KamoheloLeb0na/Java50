
abstract class Animal{
    abstract void move();
    abstract void sound();

    void sleep(){
        System.out.println("Animal walking");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    void move() {
        System.out.println("Dog runs on four legs.");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Bird chirps: Tweet Tweet!");
    }

    @Override
    void move() {
        System.out.println("Bird flies in the sky.");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Bird();

        a1.sound();
        a1.move();
        a1.sleep();

        a2.sound();
        a2.move();
    }
}