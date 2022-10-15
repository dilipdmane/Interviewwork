package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Sustractthematrices {
	
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
       
String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       
       int rows2 = Integer.valueOf(secondMultipleInput[0]).intValue();
       int columns2 = Integer.valueOf(secondMultipleInput[0]).intValue();       
       ArrayList<ArrayList<Integer>> inpArray2 = new ArrayList<>(rows2);
       
       for (int i = 0; i < rows2; i++) {
    	   String[] row = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	   ArrayList<Integer> rowData = new ArrayList<>(columns2);
    	   for (int j = 0; j < columns2; j++) {			
			rowData.add(j, Integer.valueOf(row[j]));
		}
		inpArray2.add(i, rowData);
       }// end of outer for loop
       
       //call solve method to transpose matrix
       new Sustractthematrices().solve(inpArray,inpArray2);

	}// end of main
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<ArrayList<Integer>> retArrayList = new ArrayList<ArrayList<Integer>>(A.size()) ;
		for (int i = 0; i < A.size(); i++) {
			ArrayList<Integer> rowA = A.get(i);
			ArrayList<Integer> rowB= B.get(i);
			ArrayList<Integer> sumRows = new ArrayList<Integer>(rowA.size());
			for( int j=0; j< rowA.size();j++)
			{
				sumRows.add( rowA.get(j)- rowB.get(j));			
			}
			retArrayList.add(sumRows);
		}
		return retArrayList;
    }
}//end of main
	


