import java.util.*;

public class NearestPalindrome {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		//Random rand = new Random();
		//int num = rand.nextInt(10000000);
		
		int i = 1000000000;
		System.out.println("Num : " +  num);
		System.out.println("Nearest palindrome : " + nearestPalindrome(num));
	}// main

	private static int nearestPalindrome(int num) {
		String str = String.valueOf(num);
		char[] ch = str.toCharArray();
		
		int mid = 0;
		if(str.length() % 2 == 0)
			mid = str.length()/2;
		else
			mid = str.length()/2+1;
		int front = 0;
		int end = str.length()-1;
		
		for (int i = 0; i < mid ; i++) {
			if(front == end)
				return Integer.parseInt(String.valueOf(ch));
			int forward = forward(ch,front,end);
			int backward = backward(ch,front,end);
			
			if(forward == backward && front!=end && ch[end-1]!='0'){
				System.out.println("ch[end-1] : " + ch[end-1]);
				System.out.println("number reduced " +(Integer.parseInt(String.valueOf(ch[end-1]))-1));
				ch[end-1] = (char) ((Integer.parseInt(String.valueOf(ch[end-1]))-1) + '0');
			}
			
			ch[end] = ch[front];
			front++;
			end--;
		}
		
		System.out.println(String.valueOf(ch));
		
		return Integer.parseInt(String.valueOf(ch));
	}

	private static int forward(char[] ch,int f, int e) {
		int count = 0;
		System.out.println("Forward");
		System.out.println("ch[f] : " + ch[f] );
		System.out.println("ch[e] : " + ch[e] );
		System.out.println();
		int front = Integer.parseInt(String.valueOf(ch[f]));
		int end = Integer.parseInt(String.valueOf(ch[e]));
		
		while(end != front){
			end++;
			if(end == 10){
				end = 0;
			}
			count++;
		}
		
		
		return count;
	}//forward
	
	private static int backward(char[] ch,int f, int e) {
		int count = 0;
		
		System.out.println("Backward");
		System.out.println("ch[f] : " + ch[f] );
		System.out.println("ch[e] : " + ch[e] );
		int front = Integer.parseInt(String.valueOf(ch[f]));
		int end = Integer.parseInt(String.valueOf(ch[e]));
		
		while(end != front){
			end--;
			if(end == 0){
				end = 10;
			}
			count++;
		}
		
		
		return count;
	}//forward
	

}


/*import java.util.*;

public class NearestPalindrome {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		
		
	    int t = scan.nextInt();
	    while(t-- > 0){
		int num = scan.nextInt();
		
		System.out.println(nearestPalindrome(num));
	    }
	}// main

	private static int nearestPalindrome(int num) {
		String str = String.valueOf(num);
		char[] ch = str.toCharArray();
		
		int mid = 0;
		if(str.length() % 2 == 0)
			mid = str.length()/2;
		else
			mid = str.length()/2+1;
		int front = 0;
		int end = str.length()-1;
		
		for (int i = 0; i < mid ; i++) {
			int forward = forward(ch,front,end);
			int backward = backward(ch,front,end);
			
			if((forward == backward) && front!=end){
				ch[end-1] = (char) ((Integer.parseInt(String.valueOf(ch[end-1]))-1) + '0');
			}
			
			ch[end] = ch[front];
			front++;
			end--;
		}
		
		
		return Integer.parseInt(String.valueOf(ch));
	}

	private static int forward(char[] ch,int f, int e) {
		int count = 0;
		int front = Integer.parseInt(String.valueOf(ch[f]));
		int end = Integer.parseInt(String.valueOf(ch[e]));
		
		while(end != front){
			end++;
			if(end == 10){
				end = 0;
			}
			count++;
		}
		
		
		return count;
	}//forward
	
	private static int backward(char[] ch,int f, int e) {
		int count = 0;
		int front = Integer.parseInt(String.valueOf(ch[f]));
		int end = Integer.parseInt(String.valueOf(ch[e]));
		
		while(end != front){
			end--;
			if(end == 0){
				end = 10;
			}
			count++;
		}
		
		
		return count;
	}//forward
	

}
*/