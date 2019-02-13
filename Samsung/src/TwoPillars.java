import java.util.*;

public class TwoPillars {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int testCase = scan.nextInt();
		
		while(testCase-- > 0){
			int arr[] = new int[scan.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			System.out.println(maxHeight(arr));
		}//while

	}//main

	private static int maxHeight(int[] arr) {
		
		
		return 0;
	}

}
