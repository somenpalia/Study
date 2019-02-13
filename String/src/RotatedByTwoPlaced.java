import java.util.Scanner;


public class RotatedByTwoPlaced {
	
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			
			String str1 = scan.next();
			String str2 = scan.next();
			
			System.out.println(same(str1,str2));
			
		}//while
	}

	private static int same(String str1, String str2) {
		String strTemp = str1;
		
		//anti
		for(int i = 0 ; i < 2 ; i++){
			str1 = str1.substring(1) + str1.substring(0,1);
			if(str1.equals(str2))
				return 1;
		}
		
		str1 = strTemp;
		int lastIndex = str1.length()-1;
		
		//clock
		for(int i = 0 ; i < 2 ; i++){
			str1 = str1.substring(lastIndex) + str1.substring(0,lastIndex);
			System.out.println("Clock " + (i+1) + " : " + str1);
			if(str1.equals(str2))
				return 1;
		}
		
		
		
		return 0;
	}

}
