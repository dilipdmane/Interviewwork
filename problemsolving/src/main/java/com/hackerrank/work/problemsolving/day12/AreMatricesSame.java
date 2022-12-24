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
public class AreMatricesSame {
	
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
       int[][] inpArray2 = new int[rows][columns];
       for (int i = 0; i < rows; i++) {
    	   String[] row = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	   int[] rowInt = new int[row.length];
    	   for (int j = 0; j < rowInt.length; j++) {
			rowInt[j]= Integer.valueOf(row[j]).intValue();
    	   } 
    	   inpArray2 [i] = rowInt; 
		}
		
       System.out.println(" Result : => ["+ new AreMatricesSame().solve(inpArray1, inpArray2)+"]");
       
       
	
}//end of main
	
	/***
	 * <b>Problem Description</b><br>You are given two matrices A & B of equal dimensions and you have to check whether two matrices are equal or not.
	 * <blockquote>NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j in the given range.<blockquote>
	 * Time Complexity : n2
	 * Space Complexity : 1 
	 * @param A First argument is vector of vector of integers representing matrix A.
	 * @param B Second argument is vector of vector of integers representing matrix B
	 * @return Return 1 if both matrices are equal or return 0.
	 */
	public int solve(int[][] A, int[][] B) {
		int ret = 1;		
		for (int i = 0; i < B.length; i++) 
		{
			int col = A[i].length;
			for (int j = 0; j < col; j++) {
				if (A[i][j] != B[i][j] )
					return 0;				
			}
		}		
		return ret;
    }
}//end of class

