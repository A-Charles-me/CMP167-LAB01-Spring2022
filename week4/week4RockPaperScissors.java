import java.util.Scanner;
import java.util.Random;
/*
 * @author Angel Charles
 */
public class week4RockPaperScissors {
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("Hi User! Welcome to Rock, Paper, Scissors: The Game!");
		int pcChoice = random.nextInt(3) + 1;
	
		System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors: ");
		int userChoice = input.nextInt();
		
		String status = null;
		//Winning
		if((userChoice == 3 && pcChoice == 2) || (userChoice == 1 && pcChoice == 3) || (userChoice == 2 && pcChoice == 1)) {
			status = "You Win!!";	
		}
		//Tie
		else if(userChoice == pcChoice) {
			status = "Tie!";
		}
		//Losing
		else {
			status = "You Lose ):";
		}
		
		System.out.println(status);
		System.out.println("You chose: " + userChoice);
		System.out.println("PC chose: " + pcChoice);
	}
}
