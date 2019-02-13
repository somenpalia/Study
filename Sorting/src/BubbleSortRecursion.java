
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		while(testCases-- > 0){
		int arr[] = new int[scan.nextInt()];

				for(int i  = 0 ; i < arr.length ; i++)
						arr[i] = scan.nextInt();
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(bubbleSort(arr)));
				arr = bubbleSort(arr);
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
		}//while test case wala
	}//main

	private static int[] bubbleSort(int[] arr) {
		int size = arr.length;
		boolean swap = false;
		
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					swap = true;
					arr = swap(arr,j,j+1);
				}//if
			}//for j
			
			if(!swap) return arr;

			arr = bubbleSort(arr);
			
		
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
		
	}
}
