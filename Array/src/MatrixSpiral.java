import java.util.Arrays;


public class MatrixSpiral {

	public static void main(String[] args) {
	/*	int[][] arr={
			{1,2,3},
			{8,9,4},
			{7,6,5}
		};*/
		/*int[][] arr={
				{1,2,3,4},
				{14,15,16,5},
				{13,20,17,6},
				{12,19,18,7},
				{11,10,9,8}
			};*/
		
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(Arrays.deepToString(arr));
		
		printSpiral(arr);
	}//main

	private static void printSpiral(int[][] arr) {
		
		
		int I = 0;
		int J = 0;
		int row = arr.length;
		int col = arr[0].length;
		int maxEle = row*col;
		int count = 0;
		int minCol = 0;
		int minRow = 0;
		boolean khtmKaroLoop = false;
		
		while(true){
				
				//right
				for (int j = J; j < col; j++) {
					count++;
					if(count == maxEle) khtmKaroLoop = true;
					System.out.print(arr[I][j] + " ");
					J = j;
				}
				if(khtmKaroLoop) break;
  				System.out.println();
  				
  				
				I++; 
				
				//down
				for (int i = I; i < row; i++) {
					count++;
					if(count == maxEle) khtmKaroLoop = true;
					System.out.print(arr[i][J] + " ");
					I = i;
				}
				if(khtmKaroLoop) break;
				System.out.println();
				
				
				
				J--;
				//left
				for (int j = J; j >= minCol ; j--) {
					count++;
					if(count == maxEle) khtmKaroLoop = true;
					System.out.print(arr[I][j] + " ");
					J = j;
				}
				if(khtmKaroLoop) break;
				System.out.println();
			
				I--;
				//up
				for (int i = I; i > minRow; i--) {
					count++;
					if(count == maxEle) khtmKaroLoop = true;
					System.out.print(arr[i][J] + " ");
					I = i;
				}
				if(khtmKaroLoop) break;
				System.out.println();
				
				J++; 
				minRow++; 
				minCol++; 
				col--; 
				row--;
		}//while
	}//printSpiral

}//class
