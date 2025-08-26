public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 25};
        int max = arr[0];
        for(int num : arr){
            if(num > max) max = num;
        }
        System.out.println("Largest element: " + max);
    }
}