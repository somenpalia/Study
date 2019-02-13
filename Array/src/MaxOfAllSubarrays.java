import java.util.*;

public class MaxOfAllSubarrays {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			int arrSize = scan.nextInt();
			int subArrSize = scan.nextInt();
			
			int []arr = new int[arrSize];
			
			List<Integer> list = new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			
			maxOfAllSubarrays(arr,0,subArrSize,list);
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
			
		}//while
	}//main

	private static void maxOfAllSubarrays(int[] arr,int index, int subArrSize, List<Integer> list) {
		if(index == arr.length-(subArrSize-1))
			return;
		List<Integer> tempList = new ArrayList<>();
		for (int i = index; i <= index+(subArrSize-1); i++) {
			tempList.add(arr[i]);
		}
		System.out.println("tempList : " + tempList);
		/*int max = tempList.get(0);
		for (Integer integer : tempList) {
			if(integer > max)
				max = integer;
		}*/
		list.add(Collections.max(tempList));
		//list.add(max);
		
		maxOfAllSubarrays(arr, index+1, subArrSize, list);
		
	}
}
