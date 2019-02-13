import java.util.*;
public class LongInsertionHashMap {

	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<String,Long>();
		
		map.put("Somen", 15118072l);
		
		System.out.println(map.toString());
		
		System.out.println("containsValue 15118072 (not putting l at end) : " + map.containsValue(15118072));
		System.out.println("containsValue 15118072 (putting l at end) : " + map.containsValue(15118072l));
		
		long roll = new java.util.Scanner(System.in).nextLong();
		System.out.println("containsValue 15118072 (i/p from user) : " + map.containsValue(roll));
		
	}

}
