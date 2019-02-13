import java.util.*;

public class Garbafe {
	static Scanner scan = new Scanner(System.in);
	@Override
	public void finalize(){
		System.out.println("Garbage collected");
		
	}
	public static void main(String args[]) {
		Garbafe g1 = new Garbafe();
		Garbafe g2 = new Garbafe();
		g1 = null;
		System.gc();
		System.gc();
	}//main

}
