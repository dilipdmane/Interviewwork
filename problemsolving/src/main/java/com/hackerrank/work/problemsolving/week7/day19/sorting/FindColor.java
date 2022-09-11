package com.hackerrank.work.problemsolving.week7.day19.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import com.hackerrank.work.problemsolving.Utility;

/***
 * 
 * @author jyodak
 * <p>
 * <h1>Problem Description</h1>
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 * </p>
<p>
<h1>Problem Constraints</h1>
1 <= |A| <= 2*105
1 <= A[i] <= 107
</p>
 *
 */
public class FindColor {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstAInput[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        System.out.println(new FindColor().solve( Utility.getInstance().convertStringArraytoIntArrayList(firstAInput)));       
        
	}
	
	 
	 
	 public ArrayList<Integer> solve(ArrayList<Integer> A) {
		 ArrayList<Integer> retList = new ArrayList<Integer>(A.size());
		 ArrayList<Integer> redList = new ArrayList<Integer>(0);
		 ArrayList<Integer> whiteList = new ArrayList<Integer>(0);
		 ArrayList<Integer> blueList = new ArrayList<Integer>(0);
		 
		 for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			switch (integer.intValue()) {
			case 0:
				redList.add(integer);
				break;
			case 1:
				whiteList.add(integer);
				break;
			case 2:
				blueList.add(integer);
				break;
			default:
				break;
			}
		}
			retList.addAll(redList);
			retList.addAll(whiteList);
			retList.addAll(blueList);
		 return retList;
	 }
}
