import java.util.*;

public class EpamSeema {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String s = scan.nextLine();
		
		String[] str = s.split("::");
		if(str.length == 0)
			System.out.println("0");
		
		System.out.println(Arrays.toString(str));
		
		int front = 0;
		int i = 0;
		while(s.charAt(i) != ':'){
			front++;
			i++;
		}
		int index = 0;
		for (int j = 0; j < str.length; j++) {
			if(s.charAt(j) == '\\'){
				index = j;
				break;
			}
		}
		int rear = 0;
		while(index != s.length()){
			rear++;
		}
		int ans = front*rear;
	}//main

}
//w:/a\bc::/12\xyz  w:/a\ab