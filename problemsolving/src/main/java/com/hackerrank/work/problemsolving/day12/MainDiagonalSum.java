package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author jyodak
 *
 */
public class MainDiagonalSum {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       
       int rows = Integer.valueOf(firstMultipleInput[0]).intValue();
       int columns = Integer.valueOf(firstMultipleInput[1]).intValue();       
       int[][] inpArray1 = new int[rows][columns];
       
       for (int i = 0; i < rows; i++) {
    	   String[] row = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	   int[] rowInt = new int[row.length];
    	   for (int j = 0; j < rowInt.length; j++) {
			rowInt[j]= Integer.valueOf(row[j]).intValue();
    	   } 
    	   inpArray1 [i] = rowInt; 
		}
       
		
       System.out.println(" Result : => ["+ new MainDiagonalSum().solve(inpArray1)+"]");
       
       
	
}//end of main
	/**
	 * You are given a <b>N X N</b> integer matrix. You have to find the sum of all the minor diagonal elements of A.<br>Minor diagonal of a <b>M X M</b> matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
	 * @param A
	 * @return
	 */
	public int solve(final int[][] A) {
		int retSum = 0;
		for (int i = 0; i <= A.length; i++) {
			 for (int j = 0; j < A.length; j++) {
				if( i==j)				 {
					//System.out.println( i + " , "+ j);
					retSum = retSum+A[i][j];
				 }
			}
		}		
		return retSum;
    }
}//end of class

