import java.util.*;

public class OneSwapMinNumber {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		String str = scan.nextLine();
		
		int[] num = new int[str.length()];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		int[] minEle = new int[num.length];
		int[] minEleIndex = new int[num.length];
		
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		//1233451
		for (int i = num.length-1; i >= 0 ; i--) {
			if(num[i] < min){
				min = num[i];
				minIndex = i;
				minEle[i] = min;
				minEleIndex[i] = minIndex;
			}else{
				minEle[i] = min;
				minEleIndex[i] = minIndex;
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(minEle));
		System.out.println(Arrays.toString(minEleIndex));
		
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] > minEle[i]){
				if(i == 0 && minEle[i] == 0)
					continue;
				int temp = num[i];
				num[i] = minEle[i];
				num[minEleIndex[i]] = temp;
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(num));
		
	}//main

}
