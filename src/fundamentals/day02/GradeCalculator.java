package fundamentals.day02;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 100;
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 75) {
            System.out.println("B");
        } else if (score <= 74 && score >= 60) {
            System.out.println("C");
        } else if (score <= 59 && score >= 40) {
            System.out.println("D");
        } else if (score < 40) {
            System.out.println("F");
        }
    }
}
