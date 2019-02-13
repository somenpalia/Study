import java.util.*;

public class BipartiteCheck {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int v = scan.nextInt();

		int graph[][] = new int[v][v];

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				graph[i][j] = scan.nextInt();
			}
		}
		System.out.print(" ");
		for (int i = 0; i < v; i++)
			System.out.print(" " + i);

		System.out.println("\n------------------");

		for (int i = 0; i < v; i++) {
			System.out.print(i + "|");
			for (int j = 0; j < v; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("isBarpatite : " + isBipartite(graph, v));

	}// main

	static boolean isBipartite(int graph[][], int v) {

		String colour[] = new String[v];

		boolean isRed = true;

		for (int i = 0; i < v; i++) {

			if (isRed)
				if (colour[i] == null){
					colour[i] = "red";}
			
			else if (colour[i] == null)
					colour[i] = "blue";

			for (int j = 0; j < v; j++) {

				if (graph[i][j] == 1) {

					if (i == j) {
						//System.out.println("Here");
						return false;
					}

					if (colour[j] == null)
						if (isRed)
							colour[j] = "blue";
						else
							colour[j] = "red";
					
					else
						if(colour[j]!=null && colour[i].equals(colour[j]))
							return false;
					}
				
			}// j
			isRed = !isRed;
		}// i

		return true;

	}
}
