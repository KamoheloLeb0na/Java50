
class Parent {
    void displayMessage() {
        System.out.println("hey from Parent class.");
    }
}

class Child extends Parent {

    void displayMessage() {
        System.out.println("Overtake");
    }
}

public class Main{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.displayMessage();

        Parent c = new Child();
        c.displayMessage();
    }
}
