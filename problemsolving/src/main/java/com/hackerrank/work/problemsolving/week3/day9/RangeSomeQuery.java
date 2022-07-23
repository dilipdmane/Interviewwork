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
public class RangeSomeQuery {
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       ArrayList<Integer> A = new ArrayList<>(firstMultipleInput.length);       
       for (int i = 0; i < firstMultipleInput.length; i++) {
		A.add(Integer.valueOf(firstMultipleInput[i]));
	}
       
       String noOfQuery = bufferedReader.readLine().replaceAll("\\s+$", "");       
       int queries = Integer.valueOf(noOfQuery).intValue();
       ArrayList<ArrayList<Integer>> B = new ArrayList<>(queries);
       for (int i = 0; i < queries; i++) {
    	   String[] leftRight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	   ArrayList<Integer> range = new ArrayList<>(2);
    	   range.add(Integer.valueOf(leftRight[0]));
    	   range.add(Integer.valueOf(leftRight[1]));
    	   B.add(range);
	}
       
       ArrayList<Long> rangeSum = new RangeSomeQuery().rangeSum(A, B);
       for (Iterator iterator = rangeSum.iterator(); iterator.hasNext();) {
		Long long1 = (Long) iterator.next();
		System.out.println("["+long1+"]");
	}
	}
	
	 public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		 ArrayList<Long> sumArray =  new ArrayList<>(B.size());
		
		 long pfSum[]  = new long[ A.size()];
		 pfSum[0]=A.get(0).intValue();
		 for (int i = 1; i < pfSum.length; i++) {
			pfSum[ i ]= pfSum[i-1]+A.get(i).intValue();
		}
		 
		 for( int i=0; i< B.size();i++)
		 {
			 long sum = 0;
			 ArrayList<Integer> query = B.get(i);
			 int left = query.get(0).intValue();
			 int right = query.get(1).intValue();
			 
			 if( left == right   )
			 {
				 sum = A.get(left -1);
			 }
			 else
			 {
				 if( left > 1 )
				 {
					 sum = pfSum[right-1]-pfSum[left-2];
				 }
				 else
				 {
					 sum = pfSum[right-1];
				 }
			 }
			sumArray.add(sum); 
		 } 
		 return sumArray;
	    }
	
	 
}
