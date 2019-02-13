import java.util.*;

public class SnakeAndLadder {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int testCases = scan.nextInt();
		
		while(testCases-- > 0){
			int moves[] = new int[30];
			for (int i = 0; i < 30; i++) {
				moves[i] = -1;
			}
			int noOfLadderAndSnake = scan.nextInt();
			for(int i = 1 ; i <= noOfLadderAndSnake  ; i++){
				moves[scan.nextInt()] = scan.nextInt();
			}
			System.out.println("Min moves : " + minMoves(moves,30));
		}//testCases
				
	}
	static class Qentry{
		int vertex;
		int dist;
		
	} 
	private static int minMoves(int[] moves, int N) {
	
		Queue<Qentry> q = new LinkedList<>();
		boolean[] visited = new boolean[30];
		
		//for first node
		Qentry qe = new Qentry();
		qe.vertex = 0;
		qe.dist = 0;
		q.add(qe);
		visited[qe.vertex] = true;
		
		while(!q.isEmpty()){
			qe = q.remove();
			
			if(qe.vertex == 29)break;
			
			System.out.print(qe.vertex +" : ");
			for(int i = qe.vertex+1 ; i <= (qe.vertex+6) && qe.vertex<N ; i++){
				if(i == 30){
					break;
				}
				System.out.print(i + " ");
				if(!visited[i]){
					Qentry a = new Qentry();
					a.dist = qe.dist+1;
					visited[i] = true;
					
					if(moves[i]!=-1)
						a.vertex = moves[i]; // if there is some move then its dist must be changed
					else
						a.vertex = i;
					System.out.println("qe.vertex : " + qe.vertex + " -- qe.dist : " + qe.dist);
					q.add(a);
						
					
				}//if no visited then add to queue 
			}//for next 6 vertex
			System.out.println();
		}//while
		
	return qe.dist;
	}

}
