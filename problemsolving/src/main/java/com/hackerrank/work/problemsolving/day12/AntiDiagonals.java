package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class AntiDiagonals {
	
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
       ArrayList<ArrayList<Integer>> diagonal = new AntiDiagonals().diagonal(inpArray);
       for (Iterator iterator = diagonal.iterator(); iterator.hasNext();) {
		ArrayList<Integer> arrayList = (ArrayList<Integer>) iterator.next();
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(integer+" ,");
		}
		System.out.println("\n");
	}

	}// end of main
	
	/***
	 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
	 * @param A First argument is an integer N, denoting the size of square 2D matrix.Second argument is a 2D array A of size N * N.
	 * @return Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.The vacant spaces in the grid should be assigned to 0.
	 */
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> retList = null;		
		/*ArrayList<Integer> noElementList = A.get(0);
		int N = noElementList.get(0);*/
		int N = A.size();
		retList = new ArrayList<ArrayList<Integer>>((2*N)-1);
		for ( int j = 0; j<N; j++)
		{
			int row = 0;			
			int ctr = 0;
			int col = j;
			ArrayList<Integer> rowData = new ArrayList<Integer>(N);
			while ( ctr < N )
			{
				if( (row < N)& col >=0)
				{
					rowData.add( A.get(row).get(col));
				}
				else
				{
					rowData.add( 0);
				}				
				row++;
				col--;
				ctr++;				
			}
			retList.add(rowData);
		}//end of top-row
		
		for ( int i = 1; i<N; i++)
		{
			int col=N-1;
			int row = i;
			int ctr=0;
			ArrayList<Integer> rowData = new ArrayList<Integer>(N);
			while ( ctr < N )
			{
				if( (row < N)& col>=0)
				{
					rowData.add( A.get(row).get(col));
				}
				else
				{
					rowData.add( 0);
				}				
				row++;
				col--;
				ctr++;				
			}
			retList.add(rowData);
		
		}
		return retList;
    }
}//end of main
	


