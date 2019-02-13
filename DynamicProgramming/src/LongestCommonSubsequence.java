import java.util.*;
import static java.lang.Math.max;

public class LongestCommonSubsequence {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// System.out.println("Enter string one");
		String str1 = scan.next();

		// System.out.println("Enter string two");
		String str2 = scan.next();

		System.out.println("L.C.S : " + lcs(str1, str2));
	}

	private static int lcs(String str1, String str2) {

		int[][] mat = new int[str2.length() + 1][str1.length() + 1];

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (str2.charAt(i) == str1.charAt(j)) {
					mat[i + 1][j + 1] = mat[i][j] + 1;
					sb.append(String.valueOf(str2.charAt(i)));
				} else
					mat[i + 1][j + 1] = max(mat[i + 1][j], mat[i][j + 1]);
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Answer : " + sb);
		return mat[mat.length - 1][mat[0].length - 1];

	}
}
