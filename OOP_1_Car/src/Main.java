class Main {
    String brand;
    int year;
    Car(String b, int y){
        brand = b;
        year = y;
    }
    void display(){
        System.out.println("Car: " + brand + " (" + year + ")");
    }
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2022);
        c.display();
    }
}