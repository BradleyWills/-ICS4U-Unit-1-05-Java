import java.util.Random;
import java.util.Scanner;

/**
* The DiceGame program implements an application that calculates how much 
* time a microwave should run depending on the item and how many of said item.
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
  * Calculates and outputs the amount of time depending on the item and how many of said item.
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
          System.out.println("Invalid Input.");
        }
      }
    } catch (Exception e) {
      System.out.println("Invalid Input.");
    }
  }
}