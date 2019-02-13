import java.util.*;

public class FirstNonRepeatingCharacter {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int t = Integer.parseInt(scan.nextLine());
		while(t-- > 0){
			String length = scan.nextLine();
			String str = scan.nextLine();
			
			System.out.println(firstNonRepeatitngCharacter(str));
		}//while
	}//main

	private static String firstNonRepeatitngCharacter(String str) {
		
		char[] ch = str.toCharArray();
		
		ArrayList<String> list = new ArrayList<>();
		HashSet<String> set = new HashSet<String>(); 
		
		for(int i = 0 ; i < ch.length ; i++){
			list.add(String.valueOf(ch[i]));
			set.add(String.valueOf(ch[i]));
		}
		
		if(set.size() <= ch.length/2)
			return "-1";
		System.out.println("List : " + list);
		for (int i = 0; i < ch.length; i++) {
			list.remove(0);
			System.out.println("List after removal : " + list);
			if(!list.contains(String.valueOf(ch[i])) )
				return String.valueOf(ch[i]);
		}
	
		return "-1";
	}

}
