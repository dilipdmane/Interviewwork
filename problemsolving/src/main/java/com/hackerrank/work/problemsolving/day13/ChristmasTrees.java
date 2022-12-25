package com.hackerrank.work.problemsolving.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

/**
 * 
 * @author jyodak
 *
 */
public class ChristmasTrees {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       String[] firstMultipleInput2 = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       
       int[] array1 = new int[firstMultipleInput.length];
       int[] array2 = new int[firstMultipleInput2.length];
       
       for (int i = 0; i < firstMultipleInput.length; i++) array1[i] = Integer.valueOf(firstMultipleInput[i]).intValue(); 
       for (int i = 0; i < firstMultipleInput2.length; i++) array2[i] = Integer.valueOf(firstMultipleInput2[i]).intValue();
	
       
		
        Utility.getInstance().printData(new ChristmasTrees().solve(array1,array2), System.out);
       
       
	
}//end of main

	/**
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public int solve(int[] A, int[] B) {
		
		int n = A.length;
		int minCost = Integer.MAX_VALUE;
		
		/* Starting Array from second number*/
		for (int i = 1; i < n-1 ; i++) {
			int minLeftCost = Integer.MAX_VALUE;
			int minRightCost = Integer.MAX_VALUE;
			
			for( int j = i-1;j>=0;j--)
			{
				if( (A[j] < A[i]) )
				{
					minLeftCost = Math.min(minLeftCost, B[j]);
				}
			}			
			if(minLeftCost == Integer.MAX_VALUE) continue;
			for( int k = i+1;k<n;k++)
			{
				if( (A[k] > A[i]) )
				{
					minRightCost = Math.min(minRightCost, B[k]);
				}
			}			
			if(minRightCost == Integer.MAX_VALUE) continue;			
			minCost = Math.min(minCost, B[i]+minLeftCost+minRightCost);		
		}	
		return (minCost == Integer.MAX_VALUE) ? -1:minCost;
    }
}//end of class
