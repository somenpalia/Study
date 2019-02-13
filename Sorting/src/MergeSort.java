import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		while(testCases-- > 0){
		int arr[] = new int[scan.nextInt()];

				for(int i  = 0 ; i < arr.length ; i++)
						arr[i] = scan.nextInt();
		
				mergeSort(arr, 0, arr.length - 1);
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
		}//while test case wala



	}

	private static void mergeSort(int[] arr, int left, int right) {
		
		if(left<right){
			int middle = (left+right)/2;
			
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			
			merge(arr,left,middle,right);
			//System.out.println(Arrays.toString(arr));
			//System.out.println();
		}
	}//mergeSort

	private static void merge(int[] arr, int left, int middle, int right) {
		
		
	}//merge

}// MergeSort
