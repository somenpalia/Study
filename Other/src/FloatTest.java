import java.util.*;

public class FloatTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		Float f = new Float(7f);
		int x = f.intValue();
		byte b = f.byteValue();
		double d = f.doubleValue();
		
		System.out.println(x+b+d);
		
		int a = 0;
		//assert(a>3) ? "True" : "False";
	}//main

}
