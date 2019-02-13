import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
	
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			
			String str = scan.next();
			
			if(check(str))
				System.out.println("balanced");
			else
				System.out.println("not balanced");
			
		}//while
	}//main
	
	
	
	static boolean check(String str){
		System.out.println("String : " + str);
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
				System.out.println("bracket : " + str.charAt(i) + " ");
				stack.push(String.valueOf(str.charAt(i)));
				System.out.println("stack : " + stack);
				System.out.println();
			}
			else{
				
				String temp = stack.pop();
				String comingEle = String.valueOf(str.charAt(i));
				
				System.out.println("bracket : " + str.charAt(i) + " ");
				System.out.println("stack : " + stack);
				System.out.println("temp : " + temp);
				System.out.println("comingEle : " + comingEle);
				System.out.println();
				
				if(temp.equals("(") &&  comingEle.equals(")"))
					continue;
				else if(temp.equals("[") &&  comingEle.equals("]"))
					continue;
				else if(temp.equals("{") &&  comingEle.equals("}"))
					continue;
				else
					return false;
				
				
			}
		}
		
		System.out.println("After traverse stack : " + stack);
		
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
