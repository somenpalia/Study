import java.util.Scanner;


public class TrappingWater {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while (testCases-- > 0) {

			int arr[] = new int[scan.nextInt()];
			for (int i = 0; i < arr.length; i++)
					arr[i] = scan.nextInt();

			System.out.println(trappedWater(arr));
		}// while test case wala

		
	}//main

	private static int trappedWater(int[] arr) {
		int size = arr.length;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int water = 0;
		
		left[0] = arr[0];
		for (int i = 1; i <size; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		right[size-1] = arr[size-1];
		for (int i = size-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			water+=Math.min(left[i], right[i])-arr[i];
		}
		return water;
	}

}
