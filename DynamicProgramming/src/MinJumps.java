import java.util.*;
public class MinJumps {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Min jump : " + minJump(arr));
	}

	private static int minJump(int[] arr) {
	
		int jumps[] = new int[arr.length];
		jumps[0] = 0;
		
		for(int i=1; i < arr.length ; i++){
            jumps[i] = Integer.MAX_VALUE-1;
        } 
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				//System.out.println("i: " + i + " j: " + j);
				if( i <= j + arr[j])
					if(jumps[i] > 1 + jumps[j]){
						jumps[i] = 1 + jumps[j];
					}
			}
			System.out.println();
		}
		System.out.println("jumps[] : " + Arrays.toString(jumps));
		return jumps[jumps.length-1];
	}
}
