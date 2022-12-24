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
public class MatrixScalarProduct {
	
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
        int b = Integer.valueOf(bufferedReader.readLine().replaceAll("\\s+$", "")).intValue();
		
       System.out.println(" Result : => ["+ new MatrixScalarProduct().solve(inpArray1, b)+"]");
       
       
	
}//end of main
	
	/**
	 * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
	 * @param A First argument is 2D array of integers A representing matrix.
	 * @param B Second argument is an integer B.
	 * @return You have to return a 2D array of integers after doing required operations.
	 */
	public int[][] solve(int[][] A, int B) {
		int[][] ret = null;
		if( A != null)
		{
			ret = new int[A.length][];
			for (int i = 0; i < ret.length; i++) {
				int [] row = new int[ A[i].length];
				for (int j = 0; j < row.length; j++) {
					row [j] = B*A[i][j];
				}
				ret[i]=row;				
			}
		}		
		return ret;
    }
}//end of class

