import java.util.Random;
import java.util.Scanner;

/**
* The DiceGame program implements an application that generates a random 
* number and evaluates if the user guesses it.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-28 
*/

public class DiceGame {
  // Create variables 
  static int randomizedNum;
  static int guesses;
  static boolean correct;
  
  /**
  * Calculates and checks if the users input is the same as the guess.
  */
  
  public static void main(String[] args) {
    // Create scanner and randomizer
    Scanner userInput = new Scanner(System.in);
    Random randomizer = new Random();
    // Ask for input
    System.out.println("Guess a number between 1 and 6.");
    // Generate random number 1-6
    randomizedNum = randomizer.nextInt(6) + 1;
    try { 
      while (correct == false) {
        guesses += 1;
        int userGuess = Integer.parseInt(userInput.nextLine()); 
        if (userGuess == randomizedNum) {
          correct = true;
          System.out.println("Correct! It took you " + guesses + " tries.");
        } else if ((userGuess < 1) || (userGuess > 6)) {
          System.out.println("Invalid Input. Your guess should be between 1 and 6");
        }
      }
    } catch (Exception e) {
      // Informing the user that their input is invalid
      System.out.println("Invalid Input.");
    }
  }
}