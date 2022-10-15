package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class TransposeMatrix {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       int rows = Integer.valueOf(firstMultipleInput[0]).intValue();
       int columns = Integer.valueOf(firstMultipleInput[1]).intValue();       
       ArrayList<ArrayList<Integer>> inpArray = new ArrayList<>(rows);
       
       for (int i = 0; i < rows; i++) {
    	   String[] row = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	   ArrayList<Integer> rowData = new ArrayList<>(columns);
    	   for (int j = 0; j < columns; j++) {			
			rowData.add(j, Integer.valueOf(row[j]));
		}
		inpArray.add(i, rowData);
       }// end of outer for loop
       
       //call solve method to transpose matrix
       Utility.getInstance().printMatrix(inpArray, System.out);
       Utility.getInstance().printMatrix(new TransposeMatrix().solve(inpArray), System.out);

	}// end of main
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();		
		int n = A.size();
		int m = A.get(0).size();		
		for ( int j=0;j<m;j++)
		{
			ArrayList<Integer> row = new ArrayList<Integer>(n);
			for (int i = 0; i<n;i++)
			{
				row.add( A.get(i).get(j));
			}
			retList.add(row);
		}		
		return retList;
    }
}


	


