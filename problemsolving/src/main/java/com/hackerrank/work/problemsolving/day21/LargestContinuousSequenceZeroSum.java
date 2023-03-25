package com.hackerrank.work.problemsolving.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.hackerrank.work.problemsolving.Utility;

/***
 * 
 * @author jyodak
 * <p>
 * <h1>Problem Description</h1>
 * Given an array A of N integers.Find the largest continuous sequence in a array which sums to zero.</p>
<p>
<h1>Problem Constraints</h1>
1 <= N <= 10^6
-10^7 <= A[i] <= 10^7
</p>
 *
 */
public class LargestContinuousSequenceZeroSum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);       
        
	}
	
	
	public ArrayList<Integer> lszero(ArrayList<Integer> A) {
		ArrayList<Integer> retList = new ArrayList<Integer>();
		return retList;
    }
}
