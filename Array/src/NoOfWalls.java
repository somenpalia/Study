import java.util.*;

public class NoOfWalls {
	static Scanner scan = new Scanner(System.in);

	static class Graph {
		int v;
		LinkedList<Integer> list[];

		Graph(int v) {
			this.v = v;

			list = new LinkedList[v];

			for (int i = 0; i < list.length; i++) {
				list[i] = new LinkedList<Integer>();
			}
		}//constructor
		
		public void add(int start, int end){
			list[start].add(end);
			list[end].add(start);
		}
		
		void print(){
			for(int i = 0 ; i < list.length ; i++){
				System.out.print(i );
				for(Integer k : list[i]){
					System.out.print("->" + k);
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String args[]) {
		int[][] arr = { { 1, 0, 0, 1, 1 }, 
						{ 0, 1, 1, 0, 0 }, 
						{ 1, 1, 1, 0, 1 } 
						
					  };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1)
					count++;
			}//j
		}//i
		Graph graph = new Graph(count);
		graph.add(0,3);
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1 && i!=j)
					System.out.println(i + " "  + j);
					graph.add(i, j);
			}//j
		}//i
*/		
		graph.print();
	}// main

}
