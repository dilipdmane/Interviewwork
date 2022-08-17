package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.hackerrank.work.problemsolving.Utility;

public class MaximumSubarrayEasy {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("LeastAvgofSubArray.main() ["+ new MaximumSubarrayEasy().maxSubArray(5, 12,A)+"]");
	}	
	
/**
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.But the sum must not exceed B.
 * @param A
 * @param B
 * @param C
 * @return
 */
	public int maxSubArray(int A, int B, ArrayList<Integer> C) {
      int maxSum = Integer.MIN_VALUE;            
      for(int i=0;i<A;i++){
    	  int sum = 0;
          for (int j = i; j < A; j++) {
			sum = 	sum+C.get(j);
			if( sum <=B && sum>maxSum)
			{
				maxSum = sum;
			}
		}          
      }
      return maxSum;
  }
	
	
}
