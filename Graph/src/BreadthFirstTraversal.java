import java.util.*;

public class BreadthFirstTraversal {
	static Scanner scan = new Scanner(System.in);
	static int row;
	static int col;
	
	
	static class Node{
		int i = 0;
		int j = 0;
		
		public Node(int i, int j){
			this.i = i;
			this.j = j;
		}
		@Override
		public boolean equals(Object obj) {
			Node other = (Node) obj;
			if(this.i == other.i && this.j == other.j)
				return true;
			return false;
		
		}
	}//Node
	
	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			row = scan.nextInt();
			col = scan.nextInt();

			char[][] str = new char[row][col];

			for (int i = 0; i < str.length; i++) {

				str[i] = scan.next().toCharArray();
				System.out.println(Arrays.toString(str[i]));
			}
			
			ArrayList<Node> set = new ArrayList<>(); 
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length; j++) {
					
					if(str[i][j] == 'X' && !set.contains(new Node(i,j))){
					System.out.println("Head : " + i + " " + j);
					count++;
					set.add(new Node(i,j));
					totalShapes(str,set,i,j);
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
	private static void totalShapes(char[][] str,ArrayList<Node> set,int i,int j) {

				
				
				//left
				if(isValid(i,j-1) &&  str[i][j-1] == 'X' && !set.contains(new Node(i,j-1))){
					System.out.println("left : " + (i) + " " + (j-1));
					set.add(new Node(i,j-1));
					totalShapes(str, set, i, j-1);
				}
				
				//up
				if(isValid(i-1,j) &&  str[i-1][j] == 'X' && !set.contains(new Node(i-1,j))){
					System.out.println("up : " + (i-1) + " " + (j));
					set.add(new Node(i-1,j));
					totalShapes(str, set, i-1, j);
				}
				
				//right
				if(isValid(i,j+1) &&  str[i][j+1] == 'X' && !set.contains(new Node(i,j+1))){
					System.out.println("right : " + (i) + " " + (j+1));
					set.add(new Node(i,j+1));
					totalShapes(str, set, i, j+1);
				}
				
				//down
				if(isValid(i+1,j) &&  str[i+1][j] == 'X' && !set.contains(new Node(i+1,j))){
					System.out.println("down : " + (i+1) + " " + (j));
					set.add(new Node(i+1,j));
					totalShapes(str, set, i+1, j);
				}
		
	}
}
