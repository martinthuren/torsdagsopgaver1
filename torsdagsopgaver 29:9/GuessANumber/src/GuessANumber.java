import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter value");
        int x = 0;
        if (number.hasNextInt()) {
            x = number.nextInt();
            System.out.println("Your entered value: " + x);
        } else {
            System.out.println("Please entered a integer value. ");
        }

        Scanner rightanswer = new Scanner(System.in);
        System.out.println("The random number was :" + "" + rnd_number + "" + "your number was :" + number);
        if (rnd_number == x) {
            System.out.println("your number was the right number compared to random");
        } else {
            System.out.println("your number was NOT the right number compared to random");
            while(x == rnd_number)
                number.nextInt();

        }
    }




    private static void makeAGuess(){
        // Create a Scanner object
        // Read user input

        //use hasNextInt to check if input is numeric,
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the rigth number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }


}