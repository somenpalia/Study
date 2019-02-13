import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int testCase = scan.nextInt();

		while (testCase-- > 0) {
			int noOfItems = scan.nextInt();
			int capacity = scan.nextInt();

			int values[] = new int[noOfItems];
			int weights[] = new int[noOfItems];
			
			
			
			for (int i = 0; i < noOfItems; i++) {
				values[i] = scan.nextInt();
			}
			for (int i = 0; i < noOfItems; i++) {
				weights[i] = scan.nextInt();
			}
			System.out.println("\nValues : " + Arrays.toString(values));
			System.out.println("Weights : " + Arrays.toString(weights));
			
			System.out.println(maxValue(noOfItems, values, weights, capacity));
		}// while
	}

	private static int maxValue(int noOfItems, int[] values, int[] weights, int capacity) {
		
		if(noOfItems == 0 || capacity == 0)
			return 0;
		
		if(weights[noOfItems - 1] > capacity)
			maxValue(noOfItems-1,values,weights,capacity);
		else{
			int max =  Math.max((values[noOfItems-1] + maxValue(noOfItems-1,values,weights,capacity-weights[noOfItems-1])), 
							maxValue(noOfItems-1,values,weights,capacity));
			
			System.out.println("max : " + max);
			return max;
		}
		
		return 0;
	}
}
