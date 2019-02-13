import java.util.*;

public class CopyOfBreadthFirstTraversal {
	static Scanner scan = new Scanner(System.in);
	static int row;
	static int col;
	
	

	
	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			row = scan.nextInt();
			col = scan.nextInt();

			char[][] str = new char[row][col];
			boolean visited[][] = new boolean[row][col];

			for (int i = 0; i < str.length; i++) {

				str[i] = scan.next().toCharArray();
				System.out.println(Arrays.toString(str[i]));
			}
			
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length; j++) {
					
					if(str[i][j] == 'X' && visited[i][j]==false){
					System.out.println("Head : " + i + " " + j);
					count++;
					totalShapes(str,visited,i,j);
					System.out.println();
					}
					
				}//j
			}//i
			System.out.println("Total shapes : " + count);
		}// while
 
	}
	
	public static boolean isValid(int i, int j){
		return (i>=0 && j>=0 && i<row && j<col);
	}
	private static void totalShapes(char[][] str,boolean visited[][],int i,int j) {

				
				visited[i][j] = true;
				//left
				if(isValid(i,j-1) &&  str[i][j-1] == 'X' && visited[i][j-1] == false){
					System.out.println("left : " + (i) + " " + (j-1));
					totalShapes(str, visited, i, j-1);
				}
				
				//up
				if(isValid(i-1,j) &&  str[i-1][j] == 'X' && visited[i-1][j] == false){
					System.out.println("up : " + (i-1) + " " + (j));
					totalShapes(str, visited, i-1, j);
				}
				
				//right
				if(isValid(i,j+1) &&  str[i][j+1] == 'X' && visited[i][j+1] == false){
					System.out.println("right : " + (i) + " " + (j+1));
					totalShapes(str, visited, i, j+1);
				}
				
				//down
				if(isValid(i+1,j) &&  str[i+1][j] == 'X' && visited[i+1][j] == false){
					System.out.println("down : " + (i+1) + " " + (j));
					totalShapes(str, visited, i+1, j);
				}
		
	}
}
