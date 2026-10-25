package fundamentals.day02;

public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        char currentOperation = '/';
        switch (currentOperation) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            default -> System.out.println("Unknown operation");
        }
    }
}
