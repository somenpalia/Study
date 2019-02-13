import java.util.*;

public class SamsungBomb {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String grid[][] = {
		 {"0","1","0","2","0"},
		 {"0","2","2","2","1"},
		 {"0","2","1","1","1"},
		 {"1","0","1","0","0"},
		 {"0","0","1","2","2"},
		 {"1","1","0","0","1"},
		 {"x","x","S","x","x"}
		};
		System.out.println(Arrays.deepToString(grid));
		
		int spaceShuttleIndex = (grid[grid.length-1].length)/2;
		int count = 0;
		System.out.println(noOfCoins(grid, grid.length-2, spaceShuttleIndex, count));
	}//main

	private static int noOfCoins(String[][] grid, int currentRowIndex, int spaceShuttleIndex, int count) {
		if(currentRowIndex < 0)
			return count;
		
		System.out.println("currentRowIndex : " + currentRowIndex + " & spaceShuttleIndex : " + spaceShuttleIndex);
		System.out.println(grid[currentRowIndex][spaceShuttleIndex-1]);
		
		if(grid[currentRowIndex][spaceShuttleIndex - 1] == "1"){
			count++;
			currentRowIndex--;
			spaceShuttleIndex--;
			noOfCoins(grid, currentRowIndex, spaceShuttleIndex, count);
		}
		if(grid[currentRowIndex][spaceShuttleIndex + 1] == "1"){
			count++;
			currentRowIndex--;
			spaceShuttleIndex++;
			noOfCoins(grid, currentRowIndex, spaceShuttleIndex, count);
		}
		
		return count;
	}//noOfCoins

}
