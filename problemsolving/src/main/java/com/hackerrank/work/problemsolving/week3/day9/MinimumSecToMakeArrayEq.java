package com.hackerrank.work.problemsolving.week3.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author jyodak
 * Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query. For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.<br/>
<b>Problem Constraints</b>
1 <= N, M <= 105
1 <= A[i] <= 109
1 <= L <= R <= N
 *
 */
public class MinimumSecToMakeArrayEq {
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       ArrayList<Integer> A = new ArrayList<>(firstMultipleInput.length);       
       for (int i = 0; i < firstMultipleInput.length; i++) {
		A.add(Integer.valueOf(firstMultipleInput[i]));
	}
      System.out.println(new MinimumSecToMakeArrayEq().solve(A)); 
       
	}// end of main
	
	 public int solve(ArrayList<Integer> A) {
		 int ret= 0;
		 int currentMax  = A.get(0);		 // Intialize current maximum  to first element.
		 
		 //TODO : Iterate thorugh array and get maximum from an array
		 for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Integer num = (Integer) iterator.next();			
			currentMax = Math.max(currentMax, num);
		}
		  
		 for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			 Integer num = (Integer) iterator.next();
			//TODO : Subtract each element of  an array from current maximum and keep adding subtraction values 
			 ret = ret+ ( currentMax-num.intValue());
		 }	 
		 return ret;
	    }
	
	 
}
