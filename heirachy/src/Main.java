
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);
    }

    double area() {
        return length * width;
    }
}

public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        System.out.println("Area of Circle = " + c.area());

        Rectangle r = new Rectangle(4, 6);
        r.draw();
        System.out.println("Area of Rectangle = " + r.area());
    }
}
