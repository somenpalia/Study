import java.util.*;

public class SunidhiPattern {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = 9;

		for (int k = 1; k <= n; k++)
			System.out.print(k);
		for (int k = n - 1; k > 0; k--)
			System.out.print(k);

		System.out.println();

		int spaceL = 1;
		for (int k = 1; k < n; k++) {

			for (int i = 1; i <= n - k; i++)
				System.out.print(i);

			for (int i = 1; i <= spaceL; i++)
				System.out.print(" ");
			spaceL += 2;

			for (int i = n - k; i > 0; i--)
				System.out.print(i);

			System.out.println();
		}// k
	}// main

}
