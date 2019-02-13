import java.util.*;

public class AdjacencyPrint {
	static Scanner scan = new Scanner(System.in);
	
	static class Graph{
		int vertices = 0;
		LinkedList<Integer> linkedList[];
		
		Graph(int vertices){
			this.vertices = vertices;
			linkedList = new LinkedList[vertices];
			for (int i = 0; i < linkedList.length; i++) {
				linkedList[i] = new LinkedList<>();
			}
		}//constructor
		
	}//Graph

	private static void addEdge(Graph graph, int src, int dest) {
		graph.linkedList[src].addLast(dest);
		graph.linkedList[dest].addLast(src);
	}

	private static void printGraph(Graph graph) {
		for (int i = 0; i < graph.vertices; i++) {
			System.out.print(i);
			for (Integer integer : graph.linkedList[i]) {
				System.out.print("-> " + integer);
			}//each
			System.out.println();
		}//i
	}

	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			int vertices = scan.nextInt();
			Graph graph = new Graph(vertices);
			
			int edges = scan.nextInt();
			
			for (int i = 0; i < edges; i++) {
				addEdge(graph,scan.nextInt(),scan.nextInt());
			}
			
			printGraph(graph);
		}//while
		
	}//main

}//class
