import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BufferedReaderInput {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean bool = Boolean.parseBoolean(br.readLine());
		long lon = Long.parseLong(br.readLine());
		
		System.out.println("num : " + num + " bool : " + bool + " long : " + lon);
	}//main

}
