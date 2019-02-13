import java.util.*;

public class MiddlePattern {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		String str = scan.nextLine();
		int n = str.length();
		
		int mid = (n/2);
		int index = mid;
		int count = 0;

		int row = n;
		System.out.println("row : " + row);
		int col = n + (n-1);
		System.out.println("col : " + col);

		int jahanSePrintKarnaHai = col-1;
		System.out.println("jahanSePrintKarnaHai : " + jahanSePrintKarnaHai);
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				System.out.println("j : " + j);
				System.out.println("jahanSePrintKarnaHai : " + jahanSePrintKarnaHai);
				
				if(j == jahanSePrintKarnaHai){
					System.out.println("Here");
					for(int k = 0 ; k <= count ; k++){
						System.out.println(str.charAt(index));
						index++;
						j++;
					}//k
					index = mid;
					
					jahanSePrintKarnaHai = jahanSePrintKarnaHai - 2;
				}//if
				System.out.print(" ");
				
				
			}//j
			System.out.println();
		}
				
	}//main

}
