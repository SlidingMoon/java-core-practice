package fundamentals.day02;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        int n = 15;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
