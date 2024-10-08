import java.util.Scanner;
import java.util.Random;

public class HighorLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

    
        int randomNumber = random.nextInt(10) + 1;
        int userGuess;

       
        do {
            System.out.print("Guess a number between 1 and 10: ");
            userGuess = scanner.nextInt();
        } while (userGuess < 1 || userGuess > 10); // Repeat until valid guess

        
        System.out.println("The random number was: " + randomNumber);

        
        if (userGuess < randomNumber) {
            System.out.println("Your guess was too low!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("You guessed it! On the money!");
        }


    }
}
