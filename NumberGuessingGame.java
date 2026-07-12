import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int rounds = 0;
        char playAgain;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {
            rounds++;
            int number = random.nextInt(100) + 1;
            int attempts = 7;
            boolean guessed = false;

            System.out.println("\nRound " + rounds);
            System.out.println("Guess the number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    totalScore += attempts;
                    guessed = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("You lost! The correct number was: " + number);
            }

            System.out.println("Current Score: " + totalScore);

            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = scanner.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Rounds Played: " + rounds);
        System.out.println("Final Score: " + totalScore);

        scanner.close();
    }
}
