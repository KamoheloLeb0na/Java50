class Main {
    String name;
    int age;
    Student(String n){
        name = n;
        age = 0;
    }
    Student(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob", 22);
        s1.display();
        s2.display();
    }
}