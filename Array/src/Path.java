import java.util.*;

public class Path {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		int map[][] = {
				{0,0,1,1,1},
				{1,1,1,0,1},
				{1,1,1,1,0},
				{1,0,0,0,0},
				{1,1,1,1,1}
		};
		
		boolean isPath[][] = new boolean[map.length][map[0].length];
		path(map, 0 , 0, isPath );
 
	}//main
	static boolean end = false;
	
	private static boolean path(int[][] map, int row, int col, boolean isPath[][]) {
		if(row == map.length-1 && col == map[0].length-1){
			end = true;
			return true;
		}
		
		if(!end && col+1 < map[0].length && map[row][col+1] == 1 && !isPath[row][col+1]){
			System.out.println("Right" + " , map[row+1][col] -> " + (row) + " : " + (col+1));
			isPath[row][col+1] = path(map, row, col+1, isPath);
		}
		if(!end && row+1 < map.length && map[row+1][col] == 1 && !isPath[row][col+1]){
			
			System.out.println("Down" + " , map[row+1][col] -> " + (row+1) + " : " + col);
			isPath[row+1][col] = path(map, row+1, col, isPath);
		}
		return false;
	}

}
