import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;


public class PatternRegex {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher match = pattern.matcher("");
		System.out.println(match.find());
		
		String result[] = pattern.split("");
		
		System.out.println(Arrays.toString(result));
	}//main

}
