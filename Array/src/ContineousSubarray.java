import java.util.*;

public class ContineousSubarray {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int arr[] = { 7, 2, 3, 1, 2, 3, 1, 6, 2, 3 };
		int k = 3;
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			boolean once = false;

			while (true) {
				if (i<arr.length && arr[i] >= 3) {
					if (arr[i] == 3 && once == true)
						break;
					else if (arr[i] > 3)
						break;
				}
				if (arr[i] == 3)
					once = true;
				
				System.out.println(i);
				sum += arr[i];
				i++;
			}// while
			list.add(sum);
		}// for

		System.out.println(list);
	}// main

}
