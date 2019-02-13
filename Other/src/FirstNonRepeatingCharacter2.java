import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter2 {
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
		char ch[] = str.toCharArray();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(String.valueOf(ch[i]))){
				int n = map.get(String.valueOf(ch[i]));
				n++;
				map.replace(String.valueOf(ch[i]),n);
			}
			else	
			map.put(String.valueOf(ch[i]),1);
		}
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		for (Entry<String, Integer> entry : set) {
			System.out.print(entry.getKey() + " " + entry.getValue());
			System.out.println();
		}
		for (Entry<String, Integer> entry : set) {
			if(entry.getValue() == 1)
				return entry.getKey();
		}
		return "-1";
	}

}
