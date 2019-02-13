import java.util.*;

public class IntToBinary {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		// Decimal to binary
		int numDecimal = scan.nextInt();
		int n = Integer.parseInt(Integer.toBinaryString(numDecimal));
		System.out.println("Binary : " + n);

		// Binary to decimal, Enter num only in binary format.
		String str = scan.next();
		n = Integer.parseInt(str, 2);
		System.out.println("Decimal : " + n);
	}// main

}
