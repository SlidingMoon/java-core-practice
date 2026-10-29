package fundamentals.day02;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = false;
        int n = 121;
        int resultFirst = 0;
        int original = n;


        while(n > 0) {
            int a = n % 10;
            resultFirst = resultFirst * 10 + a;
            n /= 10;
        }
        if(original == resultFirst) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }
}
