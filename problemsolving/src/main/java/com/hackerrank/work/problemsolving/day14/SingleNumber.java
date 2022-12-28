package com.hackerrank.work.problemsolving.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

public class SingleNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String firstMultipleInput[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       int[] array = new int[firstMultipleInput.length];
       for (int i = 0; i < firstMultipleInput.length; i++) {
		array[i] = Integer.valueOf(firstMultipleInput[i]).intValue();
	}
       
       Utility.getInstance().printData(new SingleNumber().singleNumber( array), System.out);
	}
	
	/**
	 * Given an array of integers A, every element appears twice except for one.
	 * <br>Find that integer that occurs once. 
	 * <br><b>NOTE:</b> Your algorithm should have a linear runtime complexity. 
	 * 
	 * @param A The first and only argument of input contains an integer array A.
	 * @return Return a single integer denoting the single element.
	 */
	public int singleNumber(final int[] A) {
		int retInt = 0;
		for (int i = 0; i < A.length; i++) 
			retInt = retInt^A[i];
		return retInt;
    }

}
