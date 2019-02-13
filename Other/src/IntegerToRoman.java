import java.util.*;

public class IntegerToRoman {
	static Scanner scan = new Scanner(System.in);
	static HashMap<Integer, String> map = new HashMap<>();
	static int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static {
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
	}

	public static void main(String args[]) {
		
		
	
		System.out.println("Enter number : ");
		int num = Integer.parseInt(scan.next());
		StringBuffer sb = new StringBuffer();
		for (int i : base) {
			while (num >= i) {
				sb.append(map.get(i));
				num = num - i;
			}
		}
		System.out.println("Roman numeral : " + sb);
	}// main

}
