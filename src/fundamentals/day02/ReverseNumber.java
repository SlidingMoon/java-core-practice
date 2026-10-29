package fundamentals.day02;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int result = 0;

        while (n > 0) {
            int a = n % 10;
            result = result * 10 + a;
            n /= 10;
        }
        System.out.println(result);
    }
}
