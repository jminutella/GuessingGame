/**
 * Guessing Game
 * @author Jim Minutella
 * @date 01/17/2015
 * 
 * Simple Guessing Game application
 * - The user choose 2 numbers as the range for a random number to be generate
 * - Exception Handling included
 *
 */
import java.util.Scanner;

public class GuessingGame {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menuOption; 
		// Main Screen //
		System.out.println("Guessing Game");
		System.out.println("---------------------");
		System.out.println("1.) Play Game");
		System.out.println("2). Exit");
		System.out.println();			
		
		while (true) {
			System.out.print("Please select a menu option: ");					
			menuOption = userInput.nextInt();
			
			if (menuOption == 2) {
				System.out.println("Exiting the game. Thanks for playing!");
				break; 
			
			} else if (menuOption == 1) {
				System.out.println("Let's start the game!");
				
				getRandomRange();
			
			} else {
					System.out.println("Sorry, that's not a valid option. Please select an option.");
					continue;
			}
		}
		
	}
	/**
	 * Determine the range of numbers to work with
	 */
	public static void getRandomRange() {
		int min;
		int max;
		
		System.out.print("Choose a minimum number: ");
		min = userInput.nextInt();
		
		System.out.print("Choose a maximum value: ");
		max = userInput.nextInt();
		
		getRandomNumber(min, max);
	}
	
	public static void getRandomNumber(int min, int max) {
		int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
		
		getAGuess(min, max, randomNumber);
	}
	
	public static void getAGuess(int min, int max, int randomNumber) {
		int guess; 
		
		while (true) {
			System.out.print("Guess a number between " + min + " and " + (max) + ": ");
			guess = userInput.nextInt();
			
			if (guess == randomNumber) {
				System.out.println("Correct! The random number is: " + randomNumber);
				break;
			}
		}
		
		
	}
}