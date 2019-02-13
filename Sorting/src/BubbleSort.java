import java.util.Arrays;


public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	private static int[] bubbleSort(int[] arr) {
		int size = arr.length;
		boolean swap = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					swap = true;
					arr = swap(arr,j,j+1);
				}//if
			}//for j
			
			if(!swap) return arr;
			swap = false;
		}
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
		
	}
}
