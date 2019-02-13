
public class Dijkastras {
	public static void main (String[] args)
    {
        /* Let us create the example graph discussed above */
       int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
       Dijkastras t = new Dijkastras();
        t.dijkstra(graph, 0);
    }

	private void dijkstra(int[][] graph, int src) {
		int V = graph.length;
		
		int dist[] = new int[V];
		boolean sptSet[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[src] = 0;
		
		for (int i = 0; i < V; i++) {
			
			int u = minDist(dist,sptSet);
			System.out.println("u " + u);
			sptSet[u] = true;
			
			for (int v = 0; v < V; v++) {
				if(!sptSet[v] && 
					dist[u]+graph[u][v]<dist[v] && 
					graph[u][v]!=0)
				{	
					System.out.println("Here");
				    dist[v] = dist[u]+graph[u][v];
				}
				
			}//v
		}//i
		
		print(dist);
	}

	private int minDist(int[] dist, boolean[] sptSet) {
		int min = Integer.MAX_VALUE;
		
		int minIndex = 0;
		
		for (int i = 0; i < sptSet.length; i++) {
			if(sptSet[i] == false && dist[i]<=min){
				min = dist[i];
				minIndex  = i;
			}
		}
		
		return minIndex;
	}

	private void print(int[] dist) {
		System.out.println("Vertex\tDistance");
		for (int i = 0; i < dist.length; i++) {
			System.out.println(i + "\t  " + dist[i]);
		}
	}
}
