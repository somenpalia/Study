import java.util.*;

public class SunidhiWipro {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		int arr1[]={1,2,3,4,5,6,7,8,9,10};
		int arr2[]={11,12,13,4,5,6,7,18,19,20};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < arr1.length ; i++){
			set.add(arr1[i]);
			
		}
		for(int i = 0 ; i < arr2.length ; i++){
			
			if(set.contains(arr2[i])){
				set.remove(arr2[i]);
			continue;
			}
		set.add(arr2[i]);
		}
	}//main

}
