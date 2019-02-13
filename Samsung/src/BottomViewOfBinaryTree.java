import java.util.*;

import javax.xml.transform.Templates;

public class BottomViewOfBinaryTree {
	static Scanner scan = new Scanner(System.in);

	static class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}// Node
	}// Node

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

	}// main

	private static void levelOrderTraversal(Node root) {
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int hd = 0;
		bottomView(root, map, hd);
		Set<Integer> keySet = map.keySet();
		System.out.println();
		System.out.println();
		for (Integer i : keySet) {
			System.out.print( i + " : " +  map.get(i) );
			System.out.println();
		}//for
		
		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
			ArrayList<Integer> temp = entry.getValue();
			System.out.print(temp.get(temp.size()-1) + " ");
		}
	}

	private static void bottomView(Node root, Map<Integer, ArrayList<Integer>> map, int hd) {
			
			if(map.containsKey(hd)){
				System.out.println("In if : root.data : " + root.data);
				System.out.println("In if : hd : " + hd);
				
				ArrayList<Integer> temp = map.get(hd);
				System.out.println("temp(before) : " + temp);
				
				temp.add(root.data);
				System.out.println("temp(after) : " + temp);
				
				map.replace(hd, temp);
				System.out.println();
				
			}else{
				System.out.println("In else : root.data : " + root.data);
				System.out.println("In else : hd : " + hd);
				System.out.println();
				
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(root.data);
				map.put(hd, temp);
			}
			if (root.left != null) {
				bottomView(root.left, map, hd-1);
			}
			if (root.right != null) {
				bottomView(root.right, map, hd+1);
			}
	}

}
