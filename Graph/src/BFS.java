import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class BFS {
	static Scanner scan = new Scanner(System.in);
	static LinkedList<Integer> linkedList[];

	static class Graph {
		int vertices = 0;

		Graph(int vertices) {
			this.vertices = vertices;
			linkedList = new LinkedList[vertices];
			for (int i = 0; i < linkedList.length; i++) {
				linkedList[i] = new LinkedList<>();
			}
		}// constructor

	}// Graph

	private static void addEdge(Graph graph, int src, int dest) {
		linkedList[src].addLast(dest);
		linkedList[dest].addLast(src);
	}

	private static void bfs(int vertex, int vertices) {
		Queue<Integer> q = new LinkedList<>();
		q.add(vertex);
		boolean visited[] = new boolean[vertices];
		System.out.println("Sa :  " + vertex);
		System.out.println();
		
		while (!q.isEmpty()) {
			vertex = q.remove();
			visited[vertex] = true;

			System.out.print(vertex + " ");

			for (Integer b : linkedList[vertex]) {

				if (visited[b] == true)
					continue;

				visited[b] = true;
				q.add(b);
			}
		}// while
	}

	public static void main(String[] args) {
		// int testCase = scan.nextInt();
		// while(testCase-- > 0){
		// int vertices = scan.nextInt();
		Graph g = new Graph(4);
		// int edges = scan.nextInt();
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		addEdge(g, 1, 2);
		addEdge(g, 2, 0);
		addEdge(g, 2, 3);
		addEdge(g, 3, 3);
		bfs(0, 4);
		// }//while

	}// main

}// class
