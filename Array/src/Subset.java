import java.util.*;

public class Subset {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int arr[] = { 1, 2,3 };

		// List<Integer[]> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		subset(arr, list, 0);
	}// m

	private static void subset(int[] arr, List<Integer> list, int length) {
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(list);

		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list);
		list2.add(arr[length]);

		length++;
		if (length != arr.length) {
			subset(arr, list1, length);
			subset(arr, list2, length);
		} else {
			System.out.println(list1);
			System.out.println(list2);
		}
	}

}
