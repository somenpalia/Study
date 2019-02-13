import java.util.*;

public class IndexSorting {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int x = 4%(3+1);
		System.out.println(x);
		TreeMap<Integer, Character> map = new TreeMap<>();
		
		int size = Integer.parseInt(scan.nextLine());
		
		for(int i = 0 ; i < size ; i++){
			System.out.println("Enter key : ");
			Integer key = Integer.parseInt(scan.nextLine());
			
			System.out.println("Enter Character");
			Character ch = scan.nextLine().charAt(0);
			map.put(key, ch);
		}
		System.out.println();
		for(Map.Entry<Integer, Character> entry : map.entrySet()){
			System.out.print(entry.getKey() + " " + entry.getValue());
			System.out.println();
		}
		
		
	}//main

}
