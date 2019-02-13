import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class DFS {
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

	public static void dfs(int v,int vertices)
    {	
		boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        System.out.print(v + " ");
        
        while(!stack.isEmpty()){
            
            int s = stack.pop();
            
             for(Integer i : linkedList[s]){
                 if(!visited[i]){
                	 visited[i] = true;
                    stack.push(i);
                    System.out.print(i + " ");
                 }
             }
        }//while
    }
	
	/*public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
        System.out.print(v + " ");
        visited[v] = true;
        
       for(Integer i : adj[v]){
           if(!visited[i])
            DFS(i,adj,visited);
       }
    }*/
	public static void main(String[] args) {
		Graph g = new Graph(4);
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		/*addEdge(g, 0, 2);
		addEdge(g, 1, 2);
		addEdge(g, 2, 0);
		addEdge(g, 2, 3);
		addEdge(g, 3, 3);*/
		dfs(0, 4);
		// }//while

	}// main

}// class
