public class Main {
    static boolean isPalindrome(int num){
        int original = num, reversed = 0;
        while(num != 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121) ? "Palindrome" : "Not Palindrome");
    }
}