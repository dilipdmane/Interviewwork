package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

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

