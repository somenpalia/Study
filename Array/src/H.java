import java.util.*;

public class H {
	static Scanner scan = new Scanner(System.in);
	static void start(){
		String s1 = "sleep";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}
	
	static String fix(String s1){
		s1 = s1 + "stream";
		System.out.println(s1 + " ");
		return "steem";
	}
	public static void main(String args[]) {
		start();
	}//main

}
