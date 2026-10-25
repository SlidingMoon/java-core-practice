package fundamentals.day02;

public class TriangleChecker {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 30;
        //a + b > c
        //a + c > b
        //b + c > a
        boolean isCreated = false;

        if ((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a)) {
            isCreated = true;
        } else {
            isCreated = false;
            System.out.println("Invalid triangle");
        }

        if (isCreated) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
