package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.hackerrank.work.problemsolving.Utility;

/**
 * 
 * @author jyodak
 *
 */
public class RowtoColumnZero {
	
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
       
		
        Utility.getInstance().printMatrix(new RowtoColumnZero().solve(inpArray1), System.out);
       
       
	
}//end of main
	/**
	 * You are given a <b>N X N</b> integer matrix. You have to find the sum of all the minor diagonal elements of A.<br>Minor diagonal of a <b>M X M</b> matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
	 * @param A
	 * @return
	 */
	public int[][] solve(final int[][] A) {
		int[][] retSum = new int[A.length][ A[0].length];		
		//TODO : Create Auxiliary array with 1
		for (int i = 0; i < A.length; i++) {			
			for (int j = 0; j < A[i].length; j++) {
				retSum[i][j]=1;
			}
		}
		//TODO Update Auxiliary array with zeros for rows and column
		for (int i = 0; i < A.length; i++) {			
			for (int j = 0; j < A[i].length; j++) {
				
				if( A[i][j]==0) {					
					for( int ctr = 0; ctr <retSum[i].length ; ctr++)
					{
						retSum[i][ctr]=0;
					}
					for( int ctr = 0; ctr <retSum.length ; ctr++)
					{
						retSum[ctr][j]=0;
					}
				}
			}
		}
		// Update Original array data in aux array
		for (int i = 0; i < A.length; i++) {			
			for (int j = 0; j < A[i].length; j++) {
				retSum[i][j]=retSum[i][j]*A[i][j];
			}
		}
		return retSum;
    }
}//end of class

