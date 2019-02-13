import java.util.*;

public class LongestIncreasingSubsequence {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Input array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Longest increasing subsequence : " + lis(arr));
		
		
		
	}
	private static int lis(int[] arr) {
		Integer temp[] = new Integer[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 1;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i])
					temp[i] = Math.max(temp[i] , temp[j]+1);
			}
		}
        
		return Collections.max(Arrays.asList(temp));
		
	}
}
