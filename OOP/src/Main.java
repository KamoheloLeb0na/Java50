
class Car {
    String brand;
    int year;

    Car(String brand, int year) {

        this.brand = brand;
        this.year = year;

        System.out.println(brand + " " + year);
    }
    Car(){
        System.out.println("New car is bieng created");
    }
}

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void  sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void  sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    void  sound(){
        System.out.println("Cow mooos");
    }
}

class Person{
    private String name = "Kamohelo";

    public String getName(){
        System.out.println(name );
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Main {
    int z = 5;

    public void printZ(){
        System.out.println("Z: "+z);
    }
    static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Car benz = new Car("Benz", 1994);

        Person person = new Person();
        person.setName("Mr Lebona");
        person.getName();

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();

    }
}