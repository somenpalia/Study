import java.util.*;


public class ContainsCheck {
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
		
		@Override
		public int hashCode() {
			return (this.i+this.j);
		}
	}//Node
	public static void main(String[] args) {
		HashSet<Node> set = new HashSet<>(); 
		//ArrayList<Node> list = new ArrayList<>(); 
		
		set.add(new Node(0,1));
		System.out.println(set.contains(new Node(0,1)));
	}

}
