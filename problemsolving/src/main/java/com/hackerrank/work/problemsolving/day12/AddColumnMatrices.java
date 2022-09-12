package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class AddColumnMatrices {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
		String noOfElement = bufferedReader.readLine().replaceAll("\\s+$", "");
       
       
       int rows = Integer.valueOf(noOfElement);
       int columns = Integer.valueOf(noOfElement);;       
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
       ArrayList<Integer> ans = new AddColumnMatrices().solve(inpArray);
       for (Iterator iterator = ans.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		System.out.println( ans+",");
	} 
       
	

	}// end of main
	/**
	 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix
	 * <br>1 <= A.size() <= 103
	 * <br>1 <= A[i].size() <= 103
	 *	<br> 1 <= A[i][j] <= 10
	 * @param A First argument is a 2D array of integers.(2D matrix).
	 * @return Return an array containing column-wise sums of original matrix.
	 */
	public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
		ArrayList<Integer> retList = new ArrayList<Integer>();		
		int noOfCol = A.get(0).size();
		for( int j =0;j<noOfCol;j++)
		{
			int sum = 0;
			for ( int i = 0 ; i<A.size();i++)
			{
				sum = sum+ A.get(i).get(j);
			}
			retList.add(sum);
		}		
		return retList;
		
    }
}//end of main
	


