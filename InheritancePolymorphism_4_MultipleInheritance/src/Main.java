interface A {
    void methodA();
}
interface B {
    void methodB();
}
class Main implements A, B {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("Method B");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}