import java.util.*;

public class CodersBit {
	public static void main(String[] args) {
		int[] arr = { 1,8,5,3,4};
		System.out.println("Ans : " + solve(arr, 7));
		;
	}

	public static int solve(int[] arr, int l) {
		ArrayList<Integer> list = new ArrayList<>();
		int[][] mat = new int[arr.length][arr.length];
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					
					mat[i][j] = arr[i];
				}
			}// j
		}// i

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				mat[i][j] = mat[i][j - 1] + arr[j];
				if (mat[i][j] >= l) {
					list.add((j - i) + 1);
				}
			}
		}// i

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("List : " + list);
		if (list.isEmpty())
			return -1;
		return Collections.min(list);
	}
}
