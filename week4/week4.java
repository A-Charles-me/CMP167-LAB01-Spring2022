/*
 * Write a program that prompts the user for their age and
 * determine weather the user can drink alcohol or not.
 */
import java.util.*;


public class week4 {
	static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Hi User! How old are you?: ");
		int userAge = scnr.nextInt();
		
		if(userAge < 21){
			System.out.println("You are too young to drink.");
		}
		else{
			System.out.println("You are old enough to drink!");
		}
	}
}
