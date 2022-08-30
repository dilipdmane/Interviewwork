package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class CountingSubarrayEasy {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("LeastAvgofSubArray.main() ["+ new CountingSubarrayEasy().solve(A,10)+"]");
	}	

	/**
	 *  Given an array A of N non-negative numbers and a non-negative number B,you need to find the number of subarrays in A with a sum less than B. We may assume that there is no overflow
	 * @param A First argument is an integer array A.
	 * @param B Second argument is an integer B
	 * @return
	 */
public int solve(ArrayList<Integer> A, int B) {
	int retArray = 0;
	
    for(int i=0;i<A.size();i++){
  	  int sum = 0;
        for (int j = i; j < A.size(); j++) {
			sum = 	sum+A.get(j);
			if( sum <B )
			{
				retArray++;
			}
		}          
    }
	return retArray;
}
	
	
}
