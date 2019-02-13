import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		while(testCases-- > 0){
		int arr[] = new int[scan.nextInt()];

				for(int i  = 0 ; i < arr.length ; i++)
						arr[i] = scan.nextInt();
		
				arr = insertionSort(arr);
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
		}//while test case wala

	}

	private static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					arr = shift(arr, j , i);
					//System.out.println(Arrays.toString(arr));
					
				}
				//System.out.println();
			}
		}

		return arr;
	}

	private static int[] shift(int[] arr, int start , int end) {
		
		int ele = arr[end];
		//System.out.println("start " + start);
		//System.out.println("end " + end);
		
		
		for (int i = end; i >= start; i--) {
			if (i == start) {
				arr[i] = ele;
				return arr;
			}
			arr[i] = arr[i-1];
		}
		return arr;
	}
}
