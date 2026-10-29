package fundamentals.day03;

public class SumDigitsLessThanFive {
    public static void main(String[] args) {
        int n = 583421;
        int result = 0;

        while (n > 0) {
            int a = n % 10;
            if (a < 5) {
                result += a;
            }
            n /= 10;
        }
        System.out.println(result);
    }
}
