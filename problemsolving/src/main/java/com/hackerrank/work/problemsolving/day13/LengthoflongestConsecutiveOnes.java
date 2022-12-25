package com.hackerrank.work.problemsolving.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author jyodak
 *
 */
public class LengthoflongestConsecutiveOnes {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");       
       
       
		
       System.out.println(" Result : => ["+ new LengthoflongestConsecutiveOnes().solve(firstMultipleInput)+"]");
       
       
	
}//end of main
	public int solve(String A) {
		int retVal = 0;
		int lengthOfStr = A.length();
		int totalNoof1 = 0;
		
		for (int i = 0; i < lengthOfStr; i++) {
			if(A.charAt(i)=='1')
			{
				totalNoof1 = totalNoof1+1;
			}			
		}
		// Return number of 1 in case of string with 1 character
		if( A.length()==1)
		{
			return  totalNoof1;
		}
		
		int[] left = new int[lengthOfStr];
		int[] right = new int[lengthOfStr];
		
		left[0] = A.charAt(0) =='1' ? 1:0;
		right[lengthOfStr-1] = A.charAt(lengthOfStr-1) =='1' ? 1:0;
		
		for (int i = 1; i < lengthOfStr; i++) {
			left[i] = A.charAt(i) =='1' ? left[i-1]+1:0;
		}
		
		for (int i = lengthOfStr-2 ; i >= 0; i--) {
			right[i] = A.charAt(i) =='1' ? right[i+1]+1:0;
		}
		
		int maxcount = 0;
		int flag = 0;
		int count = 0;
		
		for (int i = 1; i < lengthOfStr-1; i++) {
			if( A.charAt(i)=='0')
			{
				int sum = left[i-1]+right[i+1];
				if( sum < totalNoof1) 
				{
					count = sum+1;
				}
				else {
					count = totalNoof1;
				}
				
				maxcount = Math.max(maxcount, count);
				flag = 1;
				retVal = maxcount;
			}
			
		}
		
		if( flag ==0)
		{
			retVal = totalNoof1;
		}
		
		
		return retVal;
    }
}//end of class

