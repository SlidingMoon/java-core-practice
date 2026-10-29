package fundamentals.day02;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 37;
        int attempts = 0;

        while (true) {
            System.out.print("Enter number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low");
            } else if (guess > secretNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
                break;
            }
        }

        System.out.println("Attempts: " + attempts);
    }
}

