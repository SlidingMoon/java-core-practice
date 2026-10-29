package fundamentals.day03;

public class SumFromAToB {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
