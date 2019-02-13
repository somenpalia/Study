import java.util.*;

public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[][] queries = new int[scan.nextInt()][3];
		
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < queries[i].length; j++) {
				queries[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Max : " + arrayManipulation(size, queries));
	}//main
	
static long arrayManipulation(int n, int[][] queries) {
        
        long[] arr = new long[n];
        long count = 0;
        
        System.out.println("Initial : " + Arrays.toString(arr));
        for(int i = 0 ; i < queries.length ; i++){
        
            int start = queries[i][0];
            int end = queries[i][1];
            long value =(long) queries[i][2];
            
            for(int j = start; j <= end ; j++){
                if(arr[j-1]!=0){
                    arr[j-1] += value;

                    continue;
                }
                arr[j-1] = value;
            }
            
            System.out.println(++count + " : " +  Arrays.toString(arr));
        }//for each queries

        
        long max = arr[0];
            
            for(int i = 1 ; i< arr.length ; i++){
                max = Math.max(max,arr[i]);
            }
        
        
        return max;
            

    }
}
