package com.hackerrank.work.problemsolving;

import java.util.Iterator;
import java.util.Scanner;

public class CheckPerfectNum {
    public static void main(String[] args) {
    	int[] inpArr = null;
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    			 inpArr = new int[nextInt];
    			 for (int i = 0; i < nextInt; i++) {
					inpArr[i]=myObj.nextInt();					
				}
    			 
    			 for (int i = 0; i < inpArr.length; i++) {
    				 System.out.println(isPerfect(inpArr[i])?"YES":"NO");
				}
    	//System.out.println("Main.main() "+ ); 
    	
        
    }

	private static boolean isPerfect(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if( number%i==0) sum = sum+i;
		}		
		return ( sum==number) ? true:false;
	}
    
    
}