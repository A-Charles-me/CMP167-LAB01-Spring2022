/*
 * @author Angel Charles
 */
public class week5Program {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 5; i += 1){
			sum += i;
			
		}
		System.out.println(sum);
		
		double total = 0.0;
		
		for(int i = 1; i <= 1000; i += 1){
			total += i;
		}
		total /= 100;
		
		System.out.println("Total average" + total);
	}
}
