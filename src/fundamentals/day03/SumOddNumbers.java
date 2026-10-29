package fundamentals.day03;

public class SumOddNumbers {
    public static void main(String[] args) {
        int n = 15;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
