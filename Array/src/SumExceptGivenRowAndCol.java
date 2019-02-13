import java.util.*;
public class SumExceptGivenRowAndCol {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = {
			{1, 1, 2},
			{3, 4, 6},
			{5, 3, 2}};
		System.out.println("Enter i : ");
		int i = scan.nextInt();
		System.out.println("Enter j : ");
		int j = scan.nextInt();
		
		System.out.print("\nSum : " + sum(arr,i,j) );
	}
	private static int sum(int[][] arr, int row, int col) {
		int sum  = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == row || j == col)
					continue;
				sum += arr[i][j];
			}
		}
		return sum;
	}
}
