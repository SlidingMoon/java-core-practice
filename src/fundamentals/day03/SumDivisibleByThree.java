package fundamentals.day03;

public class SumDivisibleByThree {
    public static void main(String[] args) {
        int n = 20;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
