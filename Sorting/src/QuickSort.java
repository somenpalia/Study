import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		while(testCases-- > 0){
		int arr[] = new int[scan.nextInt()];

				for(int i  = 0 ; i < arr.length ; i++)
						arr[i] = scan.nextInt();
		
				quickSort(arr, 0, arr.length - 1);
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
		}//while test case wala



	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low<high){
			
			int pi = partition(arr,low,high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
			//System.out.println(Arrays.toString(arr));
			//System.out.println();
		}
	}//mergeSort

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		int i = low-1;
		for (int j = low; j < high; j++) {
			if(arr[j]<=pivot){
				i++;
				swap(arr,i,j);
			}
		}//for
		swap(arr,i+1,high);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		return i+1;
		
	}//merge

	private static void swap(int[] arr, int i, int high) {
		
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
	}

}// MergeSort
