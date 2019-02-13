import java.util.*;

public class PathBacktrack {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		int map[][] = { 
				
				{ 1, 0, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1 },
				{ 1, 1, 1, 1, 0 }, 
				{ 1, 0, 0, 0, 0 }, 
				{ 1, 1, 1, 1, 1 } 
				
		};
		int[][] sol = new int[map.length][map[0].length];
		
		if (path(map, 0, 0, sol)) {
			
			/*for (int i = 0; i < sol.length; i++) {
				for (int j = 0; j < sol.length; j++) {
					System.out.print(sol[i][j] + " ");
				}
				System.out.println();
			}*/
			boolean[][] visited = new boolean[sol.length][sol[0].length];
			printSol(sol, 0, 0, visited);
			
		} else{
			
			System.out.println("Path does not exists.");
		}
	}// main


	private static void printSol(int[][] sol, int i, int j,boolean[][] visited) {
		visited[i][j] = true;
		if(i == sol.length && j == sol[0].length)
			return;
		
		if(isValid(sol,i+1,j) && sol[i+1][j] == 1 && !visited[i+1][j] ){
			System.out.println("Down");
			printSol(sol,i+1,j,visited);
		}
		if(isValid(sol,i,j+1) && sol[i][j+1] == 1 && !visited[i][j+1] ){
			System.out.println("Right");
			printSol(sol,i,j+1,visited);
		}
		
	}


	static boolean isValid(int[][] arr, int i, int j) {
		if (i >= 0 && j >= 0 && i < arr.length && j < arr[i].length
				&& arr[i][j] == 1)
			return true;

		return false;
	}

	private static boolean path(int[][] map, int row, int col, int[][] sol) {

		if (row == map.length - 1 && col == map[0].length - 1) {
			sol[row][col] = 1;
			return true;
		}

		if (isValid(map, row, col)) {
			sol[row][col] = 1;
			
			if (path(map, row + 1, col, sol))
				return true;
			
			if (path(map, row, col + 1, sol))
				return true;
		
			sol[row][col] = 0;
			return false;
		}//if
		
		return false;
	}

}
