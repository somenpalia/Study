import java.util.*;

public class WiproPattern {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scan.nextInt();
		int s = scan.nextInt();

		int jLength = 1;
		int toPrint = s;
		boolean isReverse = false;

		for (int i = 1; i <= 2 * n; i++) {
			if (!isReverse) {
				for (int j = 1; j <= jLength; j++) {
					System.out.print(toPrint);
				}// j
				System.out.println();
				toPrint++;
				jLength++;
			} else {
				for (int j = jLength; j >= 1; j--) {
					System.out.print(toPrint);
				}// j
				System.out.println();
				toPrint--;
				jLength--;
			}
			if (i == n) {
				jLength--;
				toPrint--;
				isReverse = true;
			}
			s++;
		}
	}// main

}
