import java.util.Scanner;
public class DhirajGenpact{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int []arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}//for
		
		int swaps = swaps(arr);
	}//main
	static int swaps(int[] arr){
		if(arr[0] == 1){
			
		}
		
		return 0;
	}
	
	static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}//class