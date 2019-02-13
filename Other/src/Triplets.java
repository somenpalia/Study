
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Triplets {
	private static long deva(int n, int a[]) {

		/*
		 * int n = 100 * 1000; Random rand = new Random();
		 * 
		 * int a[] = new int[n]; for (int i = 0; i < n; i++) a[i] =
		 * rand.nextInt(Integer.MAX_VALUE);
		 */

		int appu[] = new int[n];
		int rao[] = new int[n];

		int width = 1000 * 10;
		int slots = (int) (Math.ceil(Integer.MAX_VALUE / (double) width));
		slots++;

		// Less to my left
		{
			ArrayList<Set<Integer>> sets = new ArrayList<Set<Integer>>(slots);
			int sizes[] = new int[slots];
			for (int i = 0; i < slots; i++) {
				sets.add(new HashSet<Integer>());
			}

			int slot, value, pilot;

			for (int i = 0; i < n; i++) {
				pilot = a[i];
				slot = pilot / width;

				value = 0;
				for (int j = 0; j < slot; j++)
					value += sizes[j];

				for (int chintu : sets.get(slot)) {
					if (chintu < pilot)
						value++;
				}
				appu[i] = value;

				sets.get(slot).add(a[i]);
				sizes[slot] = sets.get(slot).size();
			}
		}

		// More to my right
		{
			ArrayList<Set<Integer>> sets = new ArrayList<Set<Integer>>(slots);
			int sizes[] = new int[slots];
			for (int i = 0; i < slots; i++) {
				sets.add(new HashSet<Integer>());
			}

			int slot, value, pilot;

			for (int i = n - 1; i >= 0; i--) {
				pilot = a[i];

				slot = pilot / width;

				value = 0;
				for (int j = slot + 1; j < slots; j++)
					value += sizes[j];

				for (int chintu : sets.get(slot)) {
					if (chintu > pilot)
						value++;
				}
				rao[i] = value;

				sets.get(slot).add(a[i]);
				sizes[slot] = sets.get(slot).size();
			}
		}

		long count = 0;
		{
			Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

			int left, right;
			Integer balance;
			for (int i = 0; i < n; i++) {
				balance = cache.get(a[i]);
				if (balance == null)
					balance = -0;
				left = appu[i] - balance;
				right = rao[i];

				count += (left * right);

				cache.put(a[i], left);

			}

		}

		return count;
	}

	private static long attempt(int n, int a[], int min, int max) {

		/*
		 * int n = 100 * 1000; Random rand = new Random();
		 * 
		 * int a[] = new int[n]; for (int i = 0; i < n; i++) a[i] =
		 * rand.nextInt(Integer.MAX_VALUE);
		 */

		int appu[] = new int[n];
		int rao[] = new int[n];

		int width = 1000 ;
		int slots = (int) (Math.ceil(Integer.MAX_VALUE / (double) width));
		slots = (int) (Math.ceil(max / (double) width));
		slots++;
		int grainSize = 100;

		int totalGrains = slots / grainSize + 1;
		int sizeCache[] = new int[totalGrains];
		int oldSize;

		// Less to my left
		{
			ArrayList<Set<Integer>> sets = new ArrayList<Set<Integer>>(slots);
			int sizes[] = new int[slots];
			for (int i = 0; i < slots; i++) {
				sets.add(new HashSet<Integer>());
			}

			int slot, value, pilot;
			int grain;

			int minGrain = (min / width) / grainSize;

			for (int i = 0; i < n; i++) {
				pilot = a[i];
				slot = pilot / width;

				value = 0;
				grain = slot / grainSize;
				for (int j = minGrain; j < grain; j++)
					value += sizeCache[j];

				for (int j = grain * grainSize; j < slot; j++)
					value += sizes[j];

				for (int chintu : sets.get(slot)) {
					if (chintu < pilot)
						value++;
				}
				appu[i] = value;

				sets.get(slot).add(a[i]);
				oldSize = sizes[slot];
				sizes[slot] = sets.get(slot).size();

				if (oldSize != sizes[slot]) {
					sizeCache[grain]++;
				}
			}
		}

		for (int j = 0; j < totalGrains; j++)
			sizeCache[j] = 0;
		// More to my right
		{
			ArrayList<Set<Integer>> sets = new ArrayList<Set<Integer>>(slots);
			int sizes[] = new int[slots];
			for (int i = 0; i < slots; i++) {
				sets.add(new HashSet<Integer>());
			}

			int slot, value, pilot;
			int grain;

			for (int i = n - 1; i >= 0; i--) {
				pilot = a[i];

				slot = pilot / width;

				value = 0;
				grain = slot / grainSize;
				for (int j = grain + 1; j < totalGrains; j++)
					value += sizeCache[j];

				for (int j = slot + 1; j < (grain + 1) * grainSize && j < slots; j++)
					value += sizes[j];

				for (int chintu : sets.get(slot)) {
					if (chintu > pilot)
						value++;
				}
				rao[i] = value;

				sets.get(slot).add(a[i]);
				oldSize = sizes[slot];
				sizes[slot] = sets.get(slot).size();
				if (oldSize != sizes[slot]) {
					sizeCache[grain]++;
				}
			}
		}

		long count = 0;
		{
			Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

			int left, right;
			Integer balance;
			for (int i = 0; i < n; i++) {
				balance = cache.get(a[i]);
				if (balance == null)
					balance = -0;
				left = appu[i] - balance;
				right = rao[i];

				count += (left * right);

				cache.put(a[i], left);

			}

		}

		return count;
	}

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int i=0;
		int min = 0, max = 0, v = 0;
		for (String s : br.readLine().split(" ")) {
			v = Integer.parseInt(s);
			if(v<min)min=v;
			if(v>max)max=v;
                    a[i++]=v;
		}
		System.out.println(attempt(n, a, min, max));

	/*iint n = 100000;
		Random rand = new Random(1);
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = rand.nextInt(n * 10);
		System.out.println(new Date());
		System.out.println(attempt(n, a, 0, Integer.MAX_VALUE));
		// System.out.println(deva(n, a));
		System.out.println(new Date()); */

	}

}