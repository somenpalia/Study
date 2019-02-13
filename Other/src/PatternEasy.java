import java.util.*;

public class PatternEasy {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scan.nextInt();
		
		for (int i = n; i > 0 ; i--) {
			int k = n;
			for (int j = 1; j <= n*i; j++) {
				System.out.print(k + " ");
				if(j % i == 0)
					k--;
			}
			System.out.println();
		}
	}//main

}
