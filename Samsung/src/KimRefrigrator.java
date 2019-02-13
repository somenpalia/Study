import java.util.*;

public class KimRefrigrator {
	static Scanner scan = new Scanner(System.in);
	static int maxD = 10000;
	public static void main(String args[]) {
		int testCase = scan.nextInt();
		while(testCase-- > 0){
			int n = scan.nextInt();
			int ox = scan.nextInt();
			int oy = scan.nextInt();
			int hx = scan.nextInt();
			int hy = scan.nextInt();
			
			int arr[][] = new int[n][2];
			
			for (int i = 0; i < n; i++) {
				arr[i][0] = scan.nextInt();
				arr[i][1] = scan.nextInt();
			}
			int maximum = 10000;
			int maxD = fun(ox, oy, hx, hy, arr, n, 0, 0, maximum);
			System.out.println("#"+testCase + " " + maxD);
		}//testCase

	}//main

	private static int fun(int prevx, int prevy, int hx, int hy, int[][] arr, int n, int count, int dis, int maxD) {
		int i;
		if(dis > maxD) return 10000;
		if(count == n){
			dis += (abs(prevx - hx) + abs(prevy-hy));
			if
		}
		
		return 10000;
	}
	
	private static int abs(int a){
		if(a < 0 )
			return (a*-1);
		else
			return a;
	}

}
