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
Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
<br/>
<b>Note:</b> It is always possible to form the product array with integer (32 bit) values.
 *
 */
public class ReturnProductArray {
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       ArrayList<Integer> A = new ArrayList<>(firstMultipleInput.length);       
       for (int i = 0; i < firstMultipleInput.length; i++) {
		A.add(Integer.valueOf(firstMultipleInput[i]));
	}
      System.out.println(new ReturnProductArray().solve(A)); 
       
	}// end of main
	
	 public ArrayList<Integer> solve(ArrayList<Integer> A) {
		 ArrayList<Integer> retList = new ArrayList<>(A.size());
		 int currentProduct = 1;		 
		 for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Integer number = (Integer) iterator.next();
			currentProduct = currentProduct*number;
		}		 
		 for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Integer element = (Integer) iterator.next();
			retList.add(  currentProduct/element);			
		}		 
		 return retList;
	    }
	
	 
}
