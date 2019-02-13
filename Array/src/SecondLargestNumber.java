import java.util.*;


public class SecondLargestNumber {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 1st number : " );
		int first = scan.nextInt();

		System.out.println("Enter 2nd number : " );
		int second = scan.nextInt();
		
		System.out.println("Enter 3rd number : " );
		int third = scan.nextInt();
		
		System.out.println("2nd max number is : " + secondMax(first,second,third));
	}

	private static int secondMax(int first, int second, int third) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(first);
		set.add(second);
		set.add(third);
		
		int count = 0;
		for (Integer integer : set) {
			count++;
			if(count == 2)
				return integer;
		}
		return -1;
	}
}
