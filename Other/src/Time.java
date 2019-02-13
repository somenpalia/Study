import java.awt.geom.Arc2D.Double;
import java.util.*;

public class Time {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		String [] arr = {"a","ababa","aba"};
		int time[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            String str = arr[i];
            
            String strFinal = new String(str);
            int timeCount = 1;
            int index = 1;
            while(true){
                str = str.substring(index) + str.substring(0,index);
                
                index++;
                if(index == str.length())
                	index = 1;
                if(str.equals(strFinal)){
                    time[i] = timeCount;
                    break;
                }
                timeCount++;
            }//while
        } 
        double ans = lcm(time, time.length)/1000000000;
        ans  = ans * Math.pow(10, 7);
        ans = ans * 100;
        
        long l = (long) ans;
            System.out.println("Ans : " + l);
    }//main
    static double gcd(double a, double b){
        if(b == 0)
         return a;
         return gcd(b,a%b);
    }
    static double lcm(int [] arr2, int n){
    	int arr[] = {1,8,28,3,40,16,24,21,15,14,12,32,4,19,20,24,20,10,22,34,6,8,30,12,23,48,66,16,48,88,20,78,25,24,18,10,6,47,15,20,23,96,39,15,11,11,1,36,34,14};
    	System.out.println(Arrays.toString(arr));
        double ans = arr[0];
        
        for(int i = 1 ; i < arr.length; i++){
            ans = (((arr[i]*ans))/(gcd(arr[i],ans)));
        }
        
        return ans%1000000007;
    }

}
