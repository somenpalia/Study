import java.util.*;

public class PrimeFactorization {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		primeFactorization(num,list);
		
		System.out.println("All prime factors : \n" + list);
	}

	private static void primeFactorization(int num, ArrayList<Integer> list) {
		
		while(num % 2 == 0){
			num = num/2;
			list.add(2);
		}
		
		for (int i = 3; i <= Math.sqrt(num); i+=2) {
			while(num % i == 0){
				list.add(i);
				num = num/i;
			}
		}
		
		if(num > 2)
			list.add(num);
	}
}
