package fundamentals.day03;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int n = 25;
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
