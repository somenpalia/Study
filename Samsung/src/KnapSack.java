/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KnapSack {
    static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
	    int testCase = scan.nextInt();
	    while(testCase-- >0){
	        int n = scan.nextInt();
	        int W = scan.nextInt();
	        int val[] = new int[n];
	        int wt[] = new int[n];
	        for(int i = 0 ; i < n ; i++){
	            val[i] = scan.nextInt();
	            
	        }
	        for(int i = 0 ; i < n ; i++){
	            wt[i] = scan.nextInt();
	            
	        }
	        
	        System.out.print(knapsack(W, wt, val, n));
	    }
		//code
	}//main
	
	static int knapsack(int W, int[] wt, int[] val, int n){
	    int K[][] = new int[n+1][W+1];
	    for(int i = 0 ; i <= val.length ; i++){
	        for(int j = 0 ; j <= W ; j++){
	        	System.out.println("i : " + i + ", j : " + j);
	            if(i==0 || j==0){
	                K[i][j] = 0;
	            }
	            else if(wt[i-1] > j){
	                K[i][j] = K[i-1][j];
	                }
	            else if(wt[i-1] <= j){
                    K[i][j] = Math.max(val[i-1]+K[i-1][j - wt[i-1]],K[i-1][j]);	                
                    continue;
                 }
	        }
	        
	    }//i
	    return K[n][W];
	    
	}//kanpsack
}