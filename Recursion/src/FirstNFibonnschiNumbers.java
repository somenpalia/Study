import java.util.*;

public class FirstNFibonnschiNumbers {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		int n = scan.nextInt();
		if(n == 1){
			System.out.println("1");
			return;
		}
		if(n == 2){
			System.out.println("1 " + "1");
			return;
		}
		
		int sum = 2;
		int count = 3;
		System.out.print("1 " + "1 ");
		firstNFibonnachiNumbers(1, sum , n , count);

	}//main

	private static void firstNFibonnachiNumbers(int i, int sum, int n, int count) {
		
		if( count > n)
			return;
		
		System.out.print(sum + " ");
		int temp = i;
		i = sum;
		sum = sum + temp;
		count++;
		firstNFibonnachiNumbers(i, sum, n, count);
	}

}
