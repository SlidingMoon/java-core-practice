package fundamentals.day02;

public class DivisibleByFive {
    public static void main(String[] args) {
        int n = 15;
        if ((double) n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
