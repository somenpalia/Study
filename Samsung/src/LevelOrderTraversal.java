import java.util.*;

public class LevelOrderTraversal {
	static Scanner scan = new Scanner(System.in);
	static class Node{
		Node left,right;
		int data;
		public Node(int data){
			this.data = data;
			left = right = null;
		}//Node
	}//Node

	public static void main(String args[]) {
		Node root = new Node(20);
		
		root.left = new Node(8);
		root.right = new Node(22);
		
		root.left.left = new Node(5);
		root.left.right = new Node(3);
		
		root.right.right = new Node(25);
		
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		
		levelOrderTraversal(root);

	}//main

	private static void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node temp = queue.remove();
			
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
			
			System.out.print(temp.data + " ");
		}//while
	}

}
