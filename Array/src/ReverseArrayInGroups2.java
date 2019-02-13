import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayInGroups2 {

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
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
			

		}// while
	}

	private static void reverseGroup(int[] arr, int startIndex, int k) {

		for (int i = 0; i < arr.length; i+=k) {
			int left = i;
			int right = Math.min(i+k-1,arr.length-1);
			
			while(left<right){
				
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				
				left++;
				right--;
			}//while
			
		}//for

		
	}
}
