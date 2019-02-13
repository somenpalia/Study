import java.util.*;

public class RearranginArrays {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int arr[] = {22,1,34,22,16};
		int k = 22;
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == k){
				arr[i] = 1;
				continue;
			}
			
			index.add(arr[i]);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 1)
				break;
			System.out.print(arr[i] + " ");
		}
		for (Integer integer : index) {
			System.out.print(integer + " ");
		}
		
	}//main

}
