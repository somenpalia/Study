import java.util.*;

public class NoOfWallsFloodFill {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		/*int[][] arr = { { 1, 0, 0, 1, 1 }, 
						{ 0, 1, 1, 0, 0 }, 
						{ 1, 1, 1, 0, 1 } 
		};*/
		
		int arr[][]=  {
				{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
               
		};
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		int ans = 0;
		
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				if(arr[i][j] == 1 && visited[i][j] == false){
					uniqueWalls(arr, visited, i, j);
					ans++;
					System.out.println();
				}//if
			}//j
		}//i
		
		System.out.println(ans);
		
	}// main
	
	static boolean isValid(int[][] arr, int i, int j){
		if(i >= 0 && j >= 0 && i < arr.length && j < arr[i].length )
			return true;
		
		return false;
	}
	
	private static void uniqueWalls(int[][] arr, boolean[][] visited, int i, int j) {
		visited[i][j] = true;
		System.out.println("i : " + i + " :: j : " + j);
		 
		if(isValid(arr,i+1,j) && arr[i+1][j] == 1 && !visited[i+1][j]){
			uniqueWalls(arr,visited,i+1,j);
		}
		if(isValid(arr,i,j+1) && arr[i][j+1] == 1 && !visited[i][j+1]){
			uniqueWalls(arr,visited,i,j+1);
		}
		if(isValid(arr,i-1,j) && arr[i-1][j] == 1 && !visited[i-1][j]){
			uniqueWalls(arr,visited,i-1,j);
		}
		if(isValid(arr,i,j-1) && arr[i][j-1] == 1 && !visited[i][j-1]){
			uniqueWalls(arr,visited,i,j-1);
		}
		
	}//uniqueWalls

}
