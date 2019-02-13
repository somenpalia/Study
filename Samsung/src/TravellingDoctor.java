import java.util.*;

public class TravellingDoctor {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			int V,E,T;
			V = scan.nextInt();
			E = scan.nextInt();
			T = scan.nextInt();
			
			int graph[][] = new int[V][V];
			
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph.length; j++) {
					graph[i][j] = -1;
				}//j
			}//i
			int u,v,start = 0;
			int prob, highesProp = -1;
			while(E-- > 0){
				u = scan.nextInt();
				v = scan.nextInt();
				prob = scan.nextInt();
				graph[u][v] = prob;
				
				if(prob > highesProp){
					highesProp = prob;
					start = u;
				}
			}
			System.out.println(highesProp + " " + start);
			System.out.println(findPos(graph, start, T, V));
		}//while test case

	}//main

	private static int findPos(int[][] graph, int src, int T, int V) {
		boolean visited[] = new boolean[V];
		visited[src] = true;
		int currPos = src;
		int highestProb;
		int nextPos = 0;
		for (int t = 0; t < T/10; t+=10) {
			System.out.println("t : " + t);
			highestProb = -1;
			for(int j = 0 ; j < V ; j++){
				System.out.println("currPos : " + currPos + ", j : " + j + ", visited[j] : " + visited[j] );
				if(graph[currPos][j] != -1 && !visited[j] && graph[currPos][j]>highestProb){
					highestProb = graph[currPos][j];
					nextPos = j;
					System.out.println("highesProp : " + highestProb + ", nextPos : " + nextPos);
				}//if
			}//j
			if(highestProb == -1) break;
			currPos = nextPos;
			visited[currPos] = true;
			
		}
		return currPos;
	}

}
