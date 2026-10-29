package fundamentals.day03;

public class MinDigit {
    public static void main(String[] args) {
        int n = 86;
        int min = 9;
        while (n > 0) {
            int digit = n % 10;

            if (digit < min) {
                min = digit;
            }

            n /= 10;
        }
        System.out.println(min);
    }
}
