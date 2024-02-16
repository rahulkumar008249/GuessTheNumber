import java.util.Scanner;

class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number game!");

        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            playGame();
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static void playGame() {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 5;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            attempts++;
        }

        scanner.close();
    }
}
