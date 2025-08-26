class Shape {
    void display() {
        System.out.println("This is a Shape.");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    void display() {
        System.out.println("This is a Rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s2.display();
    }
}
