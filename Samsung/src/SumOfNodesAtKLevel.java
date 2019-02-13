import java.util.*;

public class SumOfNodesAtKLevel {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String tree = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";
		/*String tree = "(6(5()())(9()()))";*/
		int k = 2;
		
		int sum = sumAtKthNode(tree, k);
		System.out.println("Sum : " + sum);
	}//main

	private static int sumAtKthNode(String tree, int k) {
		int level = -1;
		int sum = 0;
		
		for(int i = 0 ; i < tree.length()-1 ; i++){
			if(tree.charAt(i) == '('){
				level++;
				if(level == k){
					sum += tree.charAt(i+1) - '0';
				}
			}
			else if(tree.charAt(i) == ')'){
				level--;
			}
		}
		
		return sum;
	}
	


	static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}//constructor
	}//Node
	

}
