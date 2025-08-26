public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("Largest: " + largest);
    }
}