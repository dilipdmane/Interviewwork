package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class RotateMatrix90 {
	
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
       Utility.getInstance().printMatrix(new RotateMatrix90().solve(inpArray), System.out);

	}// end of main
	/***
	 *  You are given a n x n 2D matrix A representing an image.Rotate the image by 90 degrees (clockwise).You need to do this in place.
	 *  sNote: If you end up using an additional array, you will only receive partial score.
	 * @param A
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		//TODO first do transpose for square matrix assuming it's square matrix.
		int n = A.size();
		
		for ( int i =0; i<n;i++)
		{
			for ( int j=0;j<i;j++)
			{
				Integer temp = A.get(i).get(j);
				A.get(i).set(j, A.get(j).get(i));
				A.get(j).set(i, temp);
			}
		}
		for ( int i =0; i<n;i++)
		{
			ArrayList<Integer> row = A.get(i);
			for ( int j=0; j<n/2;j++)
			{
				Integer temp = row.get(j);
				row.set(j, row.get(n- (j+1)));
				row.set( n- (j+1),temp);
			}
		}
		return A;
    }
}


	


