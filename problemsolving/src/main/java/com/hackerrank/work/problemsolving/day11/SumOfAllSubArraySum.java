package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class SumOfAllSubArraySum {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("MaxSumContiguousSubArray.main()" + new MaxSumContiguousSubArray().maxSubArray(A));
	}	
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public Long subarraySum(ArrayList<Integer> A) {
		Long retVal = Long.valueOf(0);
		long length = A.size();
		long  noOfOcc = 0;
		
		for( int i=0;i<length;i++)
		{
			noOfOcc = (i+1)*(length-i);
			retVal = retVal+  noOfOcc*A.get(i).longValue();
			
		}
		return retVal;
    }
	
	
}
