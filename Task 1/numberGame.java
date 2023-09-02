import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int numRounds = 1;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--rounds")) {
                try {
                    numRounds = Integer.parseInt(args[i + 1]);
                    i++;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number of rounds. Using default (1 round).");
                }
            } else if (args[i].equals("--min")) {
                try {
                    min = Integer.parseInt(args[i + 1]);
                    i++;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid minimum number. Using default (1).");
                }
            } else if (args[i].equals("--max")) {
                try {
                    max = Integer.parseInt(args[i + 1]);
                    i++;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid maximum number. Using default (100).");
                }
            }
        }

        int attempts = 0; 
        int totalAttempts = 0; 
        Scanner scanner = new Scanner(System.in);

        for (int round = 1; round <= numRounds; round++) {
            attempts = 0;
            int num = new Random().nextInt(max - min + 1) + min;
            System.out.println("Round " + round + " - Guess the number between " + min + " and " + max + ":");
            while (true) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == num) {
                    System.out.println("Congratulations! You guessed the number " + num + " correctly in " + attempts + " attempts.");
                    break;
                } else if (guess < num) {
                    System.out.println("The number is greater than " + guess + ". Try again:");
                } else {
                    System.out.println("The number is smaller than " + guess + ". Try again:");
                }
            }
            totalAttempts += attempts;
        }

        scanner.close();

        System.out.println("Game Over\nTotal rounds played: " + numRounds + "\nTotal attempts: " + totalAttempts);
    }
}
