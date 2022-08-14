package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.hackerrank.work.problemsolving.Utility;

public class MaxSumContiguousSubArray {

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
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
      int sum = 0;
      
      for(int i=0;i<A.size();i++){

          sum = sum + A.get(i);
          max = Math.max(max,sum);

          if(sum<0)
              sum = 0;

      }

      return max;
  }
	
}
