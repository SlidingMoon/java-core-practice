package fundamentals.day02;

public class SomeTask {
    public static void main(String[] args) {
        int number = 583421;
        int quantity = 0;
        int sumNumber = 0;
        int multipNumber = 1;
        int maxNumber = 0;
        int minNumber = 9;
        while (number > 0) {
            int a = number % 10;
            quantity++;
            sumNumber += a;
            multipNumber *= a;
            if (a > maxNumber) {
                maxNumber = a;
            }
            if (minNumber > a) {
                minNumber = a;
            }
            number /= 10;
        }


        System.out.println(quantity);
        System.out.println(sumNumber);
        System.out.println(multipNumber);
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
