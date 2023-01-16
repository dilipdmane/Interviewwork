package com.hackerrank.work.problemsolving.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class InterestingArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// TODO Take First line using buffer reader and separate element by space.
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int[] array = Utility.getInstance().convertStringArraytoIntArray(firstMultipleInput);
		Utility.getInstance().printData( new InterestingArray().solve(array),System.out);
	}
	
	
	/**
	 * Given an array arr[] with N elements, the task is to find whether all the elements of the given array can be made 0 by given operations. Only 2 types of operations can be performed on this array:<br>Split an element B into 2 elements C and D such that B = C + D.<br>Merge 2 elements P and Q as one element R such that R = P^Q i.e. (XOR of P and Q).<br>You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merges?
	 * @param A The first argument is an integer array A of size N.
	 * @return Return "Yes" if it is possible otherwise return "No".
	 */
	public String solve(int[] A) 
	 {
		 String retStr = "Yes";
		 /***
		  *     If any element in the array is even 
		  *     then it can be made 0. Split that element in two equal parts of arr[i]/2 and arr[i]/2.
		  *      XOR of two equal numbers is zero. Therefore this strategy makes an element 0.
		  *     
		  *     If any element is odd. 
		  *     Split it into two parts: 1 and arr[i]-1. 
		  *     Since arr[i]-1 is even, it can be made 0 by the above strategy. 
		  *     Therefore an odd element can reduce its size to 1. Two odd elements can, therefore, be made 0 by following the above strategy
		  *      and finally XOR them (i.e. 1) as 1 XOR 1 = 0. Therefore if the number of odd elements in the array is even, then the answer is possible. Otherwise, an element of value 1 will be left and it is not possible to satisfy the condition.
		  */
		 
		 int ctr=0;
		 
		 for (int i = 0; i < A.length; i++) {
			if( (A[i]&1) == 1) ctr++;
		}
		 
		 if( (ctr&1) ==1 ) retStr = "No";
		 
		 return retStr ;
	 }
	
	

}
