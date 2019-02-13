import java.util.*;

public class UniqueWord {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String[] str = {"abbc" , "abbc" , "mnk", "klm" };
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if(map.containsKey(str[i])){
				int num = map.get(str[i]);
				num++;
				map.replace(str[i], num);
			}else
				map.put(str[i], 1);
		}
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			if(entry.getValue() == 1)
				System.out.println(entry.getKey());
		}
	}//main

}
