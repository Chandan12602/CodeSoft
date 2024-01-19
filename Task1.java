
import java.util.Scanner;
import java.util.Random;

public class Task1 
   {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess, number, attempts = 0, score = 0, playAgain = 1;
        final int maxAttempts = 10;
        final int minNumber = 1, maxNumber = 100;

        System.out.println("Welcome to the guessing game!");

        while (playAgain == 1)
        {
            number = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            attempts = 0;

            System.out.printf("I'm thinking of a number between %d and %d. Can you guess it?\n", minNumber, maxNumber);

            while (attempts < maxAttempts) 
            {
                System.out.printf("Attempt %d: ", attempts + 1);
                guess = scanner.nextInt();
                attempts++;

                if (guess == number)
                {
                    System.out.printf("Congratulations! You guessed the number in %d attempts.\n", attempts);
                    score++;
                    break;
                } else if (guess < number)
                {
                    System.out.print("The Number you have entered in Too Less than the given Number ");
                } else 
                {
                    System.out.print("The Number you have entered in Too High than the given Number ");
                }

                System.out.println("Try again.");
            }

            if (attempts == maxAttempts)
        
            {
                System.out.println("\n\nGAME OVER");
                System.out.printf("Sorry, you ran out of attempts. The number was %d.\n", number);
            }

            System.out.print("Your score is " + score + ". Do you want to play Number Gaming Guess again? (1 for yes,0 for no): ");
            playAgain = scanner.nextInt();
        }

        System.out.println("Thanks for playing!");
    }
}
