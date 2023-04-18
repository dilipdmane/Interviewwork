/**
 * 
 */
package com.hackerrank.work.problemsolving.day22;

import java.util.HashMap;

/**
 * @author dilipdmane
 *
 */
public class SubarrayWithGivenSum {
	
	/**
	 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
		If the answer does not exist return an array with a single element "-1".
			First sub-array means the sub-array for which starting index in minimum.
	 * @param A
	 * @param B
	 * @return
	 */
	public int[] solve(int[] A, int B) {
		int[] retArray = new int[] {-1};
		
		//TODO Calculate Prefix sum to find range calculations
		//TODO Create Frequency map using hashmap for prefix sum
		int[] pSum  =new int[A.length];
		HashMap<Integer,Integer> frqMap = new HashMap<>(); 
		pSum[0] = A[0];
		frqMap.put(A[0], 0);
		for (int i = 1; i < pSum.length; i++) {
			pSum[i]=pSum[i-1]+A[i];
			
			if( frqMap.containsKey(pSum[i]))
			{
				frqMap.put(pSum[i], frqMap.get(pSum[i]).intValue()+1);
			}
			else
			{
				frqMap.put(pSum[i], 1);
			}
		}
		
		/***
		 * SUM(i,j) = pSum[j] - pSum[i-1]
		 * B = pSum[j] - pSum[i-1]
		 * pSum[j] = B + pSum[i-1]
		 */
		
		
		
		return retArray;
    }

}
