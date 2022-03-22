/*
 * 
 * @author Angel Charles
 */
public class week07Program {
	public static void main(String[] args) {
		int [] numbers = new int [100];
		String [] names = {"Maria", "Azis", "Galin", "Galena"};
		double [] balances = new double [] {2.56, 12.57, 36.57, 57.89};
		
		//Length
		System.out.println(numbers.length);
		System.out.println(names.length);
		System.out.println(balances.length);
		System.out.println("__________________________________________");
		
		//Modifying
		names[3] = "Celine Dion";
		System.out.println("__________________________________________");
		
		//Looping 
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		System.out.println("__________________________________________");
		
		for(String name: names){
			System.out.println(name);
		}
		
		//Modifying array
		System.out.println("__________________________________________");
		for(int i = 0; i < names.length; i++){
			names [i] = names[i] + " Gonzales";
			System.out.println(names[i]);
		}
		
		//Calculating total of the balances
		double total = 0.0;
		for (int i = 0; i < balances.length; i++) {
			total += balances[i];
		}
		System.out.println("Total Balance: " + total);
		
		//Calculating the average of the total balances
		double Avg = total / balances.length;
		System.out.println("Average Balance: " + Avg);
	}
}
