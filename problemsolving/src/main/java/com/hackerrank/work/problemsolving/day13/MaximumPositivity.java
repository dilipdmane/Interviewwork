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
public class MaximumPositivity {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// TODO Take First line using buffer reader and separate element by space.
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int[] array1 = new int[firstMultipleInput.length];
		for (int i = 0; i < firstMultipleInput.length; i++)array1[i] = Integer.valueOf(firstMultipleInput[i]).intValue();
		Utility.getInstance().printMatrix(array1, System.out);
	}// end of main

	/**
	 * 
	 * Given an array of integers A, of size N.<br>Return the maximum size sub-array of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.<br><b>NOTE:</b> It is guaranteed that an answer always exists.
	 * @param A The first and only argument given is the integer array A.
	 * @return maximum size sub-array of A having only non-negative elements. If there are more than one such sub-arrays, return the one having earliest starting index in 
	 */
	public int[] solve(int[] A) {
		int[] retArray = null;
		
		int maxArraySize = 0;
		int arrayCount=0;
		int firstIndex = -1;
		for (int i = 0; i < A.length; i++) {
			if( arrayCount > 0 )
			{
				if( A[i]<0)
				{
					if( arrayCount > maxArraySize )
					{
						maxArraySize = arrayCount;
						retArray = new int[arrayCount];
						for (int j =firstIndex,ctr = 0 ; j < i; j++,ctr++) {
							retArray[ctr] = A[j];
						} 
					}
					arrayCount = 0;
					firstIndex = -1;
				}
				else
				{
					arrayCount++;
					if(arrayCount > maxArraySize && i==A.length-1)
					{
						retArray = new int[arrayCount];
						for (int j =firstIndex,ctr = 0 ; j < A.length; j++,ctr++) {
							retArray[ctr] = A[j];
						} 
					}
					
				}
			}
			else
			{
				if( A[i]>0)
				{
					firstIndex = i;
					arrayCount++;
				}				
			}
			
		}
		return retArray;
	}
}
