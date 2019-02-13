import java.io.*;
import java.util.*;

public class ArrayMaxLast {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) throws IOException {
		try {
			int t = scan.nextInt();
			// System.out.println("t : " + t);
			while (t-- > 0) {
				int n = scan.nextInt();
				// System.out.println("n : " + n);
				Integer[] arr = new Integer[n];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = scan.nextInt();
					// System.out.println("arr[i] : " + arr[i]);

				}

				System.out.println(maxSubArray(arr));

			}// while

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

	static Integer maxSubArray(Integer[] arr) {
		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				int v = map.get(arr[i]);
				v = i;
				map.replace(arr[i], v);

			} else
				map.put(arr[i], i);

		}// for

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.print("Key is: " + me.getKey() + " & ");
			System.out.println("Value is: " + me.getValue());
		}

		List<Integer> list = new ArrayList<>();
		System.out.println();
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		Integer[] ans = new Integer[arr.length];
		list.add(map.get(arr[0]));
		ans[0] = 0;

		for (int i = 1; i < arr.length; i++) {

			if (map.get(arr[i]) < Collections.max(list)) {
				ans[i] = (Collections.max(list) - map.get(arr[i]))+1;
			} else {
				ans[i] = 0;
				list.add(map.get(arr[i]));
			}
		}

		System.out.println();

		System.out.println(Arrays.toString(ans));

		return Collections.max((List<Integer>) Arrays.asList(ans));

	}// maxSubArray

}