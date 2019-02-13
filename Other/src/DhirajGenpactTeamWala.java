import java.util.*;

public class DhirajGenpactTeamWala {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int arr[] = new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
		int noOfTeams = scan.nextInt();
		int groupSize = scan.nextInt();

		int sum = sol(arr, noOfTeams, groupSize);
		System.out.println(sum);
	}// main

	private static int sol(int[] arr, int noOfTeams, int groupSize) {
		System.out.println("here");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		ArrayList<Integer> arrListSol = new ArrayList<Integer>();
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();

		int noOfTeamsCount = 0;
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		if(arrList.size() < groupSize){
			int sum = arrList.stream().mapToInt(Integer::intValue).sum();
			return sum;
		}
		
		int set1Size = 0;
		int set2Size = 0;
		while (noOfTeamsCount != noOfTeams) {
			
			for (int i = 0; i < groupSize; i++) {
				set1.add(arrList.get(i));
			}
			if (arrList.size() - set1.size() > groupSize) {
				int indexForLast = arrList.size() - 1;
				for (int i = 0; i < groupSize; i++) {
					set2.add(arrList.get(indexForLast));
					indexForLast--;
				}
			} else {
				int indexForLast = arrList.size() - 1;
				for (int i = arrList.size() - 1; i >= arrList.size()
						- set1.size(); i--) {
					set2.add(arrList.get(i));
				}
			}
			
			System.out.println("set1 : " + set1);
			System.out.println("set2 : " + set2);
			
			int ele = Math.max(Collections.max(set1), Collections.max(set2));
			arrListSol.add(ele);
			System.out.println("Ele : " + ele);
			noOfTeamsCount++;
			int indexEle = arrList.indexOf(ele);
			arrList.remove(indexEle);
			set1Size = set1.size();
			set2Size = set2.size();
			set1.removeAll(set1);
			set2.removeAll(set2);

		}// while

		return arrListSol.stream().mapToInt(Integer::intValue).sum();
	}

}
