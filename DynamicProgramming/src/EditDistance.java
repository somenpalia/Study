/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class EditDistance {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int t = Integer.parseInt(scan.next());
		while (t-- > 0) {
			int str1Size = Integer.parseInt(scan.next());
			int str2Size = Integer.parseInt(scan.next());

			String str1 = scan.nextLine();
			String str2 = scan.nextLine();

			System.out.println(editD(str1, str2));
		}// while
	}// main

	static int editD(String str2, String str1) {
		int mat[][] = new int[str2.length() + 1][str1.length() + 1];

		for (int i = 0; i <= str2.length(); i++) {
			mat[i][0] = i;
		}
		for (int j = 0; j <= str1.length(); j++) {
			mat[0][j] = j;
		}

		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (str2.charAt(i) == str1.charAt(j)) {
					mat[i + 1][j + 1] = mat[i][j];
				} else {
					mat[i + 1][j + 1] = Math.min((Math.min(mat[i][j], mat[i + 1][j])),
									mat[i][j + 1]);
				}
			}
		}
		for (int i = 0; i <= str2.length(); i++) {
			for (int j = 0; j <= str1.length(); j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		return mat[str2.length()][str1.length()];
	}// editD
}