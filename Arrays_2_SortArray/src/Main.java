import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for(int num : arr) System.out.print(num + " ");
    }
}