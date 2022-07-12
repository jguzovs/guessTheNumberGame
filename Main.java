import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to guessTheNumberGame!");
        System.out.println("Enter the number which is gonna be the bound:");

        int bound = scanner.nextInt();

        int numberToGuess = random.nextInt(bound);

        System.out.println("Enter how many lives you want to have:");

        int livesLeft = scanner.nextInt();

        int tryCount = 0;

        while (true) {
            System.out.println("You got " + livesLeft + " lives left.");
            System.out.println("Enter your guess(0-" + bound + "): ");

            int playerGuess = scanner.nextInt();
            tryCount++;
            livesLeft--;

            if (playerGuess == numberToGuess && livesLeft >= 1) {
                System.out.println("You are right! You win!");
                System.out.println("It took you " + tryCount + " tries to guess.");
                break;
            }
            else if (playerGuess < numberToGuess && livesLeft >= 1) {
                System.out.println("Nope! The number is higher! Guess again.");
            }
            else if (playerGuess > numberToGuess && livesLeft >= 1) {
                System.out.println("Nope! The number is lower! Guess again.");
            }
            else {
                System.out.println("You ran out of lives!");
                System.out.println("The number was:" + numberToGuess);
                break;
            }
        }
    }
}
