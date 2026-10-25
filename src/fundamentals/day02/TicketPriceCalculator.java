package fundamentals.day02;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        int age = 50;
        boolean isStudent = true;
        boolean isWeekend = true;
        double basePrice = 75.40;
        double result = 0;

        if (age < 6) {
            result = 0;
        } else if (age <= 17 && age >= 6) {
            result = basePrice / 2;
        } else if (isStudent) {
            result = basePrice - (((double) 25 / 100) * basePrice);
        } else if (age >= 65) {
            result = basePrice - (((double) 40 / 100) * basePrice);
        } else {
            result = basePrice;
        }

        if (isWeekend) {
            result *= 1.1;
        }
        System.out.println(result);
    }
}
