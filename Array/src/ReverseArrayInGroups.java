import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayInGroups {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while (testCase-- > 0) {

			int size = scan.nextInt();
			int[] arr = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int k = scan.nextInt();
			reverseGroup(arr, 1, k);
			//System.out.println(Arrays.toString(reverseGroup(arr, 1, k)));

		}// while
	}

	private static int[] reverseGroup(int[] arr, int startIndexI, int k) {

		/*
		 * if (k > arr.length - 1) return arr;
		 * 
		 * 
		 * int mid; if (k % 2 == 1) mid = ((k - startIndex) / 2); else mid = ((k
		 * - startIndex) / 2)-1;
		 * 
		 * for (int i = startIndex; i <= mid; i++, k--) { int temp = arr[i];
		 * arr[i] = arr[k - 1]; arr[k - 1] = temp; }
		 * System.out.println(Arrays.toString(arr)); reverseGroup(arr,k+1,k);
		 * 
		 * return arr;
		 */
		System.out.println("startIndexI : " + startIndexI);
		System.out.println("k : " + k);
		int startIndex = startIndexI-1;
		
		if (startIndexI > arr.length)
			return arr;

		ArrayList<Integer> list = new ArrayList<>();

		if (startIndex + (k) <= arr.length) {
			for (int i = startIndex; i <= startIndex + (k-1); i++) {
				list.add(arr[i]);
			}
		} else {
			System.out.println("In else");
			for (int i = startIndex; i < arr.length; i++) {
				list.add(arr[i]);
			}
		}

		Collections.reverse(list);
		
		
		int i = startIndex;

		for (Integer integer : list) {
			arr[i] = integer;
			i++;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int offset = k;
		int newIndex = k+1;
		reverseGroup(arr, newIndex, offset);

		return arr;
	}
}
