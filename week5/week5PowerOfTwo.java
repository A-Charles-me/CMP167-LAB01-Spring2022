/*
 * Write a program that calculates all power from 1 to 10
 * 
 * 2 4 8 16 32 ... 
 */

public class week5PowerOfTwo {
	public static void main(String[] args) {
		
		for(int x = 1; x <= 1024; x = x * 2){
			System.out.print(x + " ");
		}
	}
}
