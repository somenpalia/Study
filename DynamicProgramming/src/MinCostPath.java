import java.util.*;

public class MinCostPath {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
			int mat[][] = {{1,3,5,8} , 
						   {4,2,1,7} , 
						   {4,3,2,3}};
			
			System.out.println("Min path : " + minPath(mat));
		
			
			
	}//main

	private static int minPath(int[][] mat) {
		int temp[][] = new int[mat.length][mat[0].length];
		temp[0][0] = mat[0][0];
		
		int i = 0;
		for (int j = 1; j < temp[0].length; j++) {
			temp[i][j] += temp[i][j-1] + mat[i][j]; 
		}
		
		int j = 0;
		for (i = 1; i < temp.length; i++) {
			temp[i][j] += temp[i-1][j] + mat[i][j]; 
		}
		
		for (i = 1; i < temp.length; i++) {
			for (j = 1; j < temp[0].length; j++) {
				temp[i][j] = mat[i][j] + Math.min(temp[i-1][j], temp[i][j-1]);
			}
		}
		System.out.println(Arrays.deepToString(temp));
		
		path(temp,mat);
		return temp[temp.length-1][temp[0].length-1];
	}

	private static void path(int[][] temp, int[][] mat) {
		
		int i = temp.length-1;
		int j = temp[0].length-1;
		
		while(true){
			System.out.println(mat[i][j]);
			if(i == 0 && j == 1 || i == 1 && j == 0)
				break;
			
			if(temp[i-1][j] <  temp[i][j-1]){
				i = i-1;
			}else{
				j = j-1;
			}
		}//while
		
		System.out.println(mat[0][0]);
		
	}

}
