import java.util.*;
import java.lang.*;
import java.io.*;

public class GFGPalindromDeepak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, c = 0, d = 0, e = 0;

		/*
		 * n = Integer.parseInt(scan.next()); while(e<n){
		 */

		String str = new String();
		str = scan.nextLine();
		int l = str.length();

		for (int i = 0; i <= (l / 2); i += 2) {
			if ((str.charAt(i)) != (str.charAt(l - 1 - i))) {
				break;
			} else {
				System.out.println("For c == 1");
				c = 1;
			}
		}
		for (int i = 1; i <= (l / 2); i += 2) {
			if ((str.charAt(i)) != (str.charAt(l - 1 - i))) {
				break;
			} else {
				System.out.println("For d == 1");
				d = 1;
			}
		}

		for (int i = 0; i <= (l / 2); i++) {
			if ((str.charAt(i)) != (str.charAt(l - 1 - i))) {
				break;
			} else {
				System.out.println("For c == 2");
				c = 2;
			}
		}
		if (c == 2) {
			System.out.println("PARENT");
		} else if (c == 1 && d == 1) {
			System.out.println("TWIN");
		} else if (c == 1) {
			System.out.println("ODD");
		} else if (d == 1) {
			System.out.println("EVEN");
		} else {
			System.out.println("ALIEN");
		}
		/*
		 * e++; }
		 */
	}
}