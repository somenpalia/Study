/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestCommonSuperSequence{
    static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
		int t = Integer.parseInt(scan.nextLine());
		while(t-- > 0){
		    String str1 = scan.next();
		    String str2 = scan.next();
		    System.out.println("str1 : " + str1);
		    System.out.println("str2 : " + str2);
		    HashSet<String> set = new HashSet<>();
		    
		    for(int i = 0 ; i < str1.length() ; i++)
		        set.add(String.valueOf(str1.charAt(i)));
		    
		    for(int i = 0 ; i < str2.length() ; i++)
		        set.add(String.valueOf(str2.charAt(i)));
		        
		   System.out.println(set.size());
		}//while
	}
}