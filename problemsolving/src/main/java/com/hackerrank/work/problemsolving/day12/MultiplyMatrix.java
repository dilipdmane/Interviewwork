package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MultiplyMatrix {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate  element by space.
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
       int columns2 = Integer.valueOf(secondMultipleInput[1]).intValue();       
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
       ArrayList<ArrayList<Integer>> solve = new MultiplyMatrix().solve(inpArray,inpArray2);
       for (Iterator iterator = solve.iterator(); iterator.hasNext();) {
		ArrayList<Integer> arrayList = (ArrayList<Integer>) iterator.next();
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			System.out.print( integer + ",");
		}
		System.out.println();
	}

	}// end of main
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<ArrayList<Integer>> retArrayList = new ArrayList<ArrayList<Integer>>(A.size()) ;//TODO Setting up size as "m"
		int m = A.size();		
		for( int i=0;i<m;i++)		{
			ArrayList<Integer> aRow = A.get(i);			
			//TODO get p size from array B
			int p = B.get(0).size();
			ArrayList<Integer> sumList = new ArrayList<Integer>(p);
			for ( int j=0; j<p;j++)
			{
				int sum = 0;
				for (int k =0; k<aRow.size();k++ )
				{
					sum = sum + ( aRow.get(k)* B.get(k).get(j));
				}
				sumList.add(sum);
			}
			retArrayList.add(sumList);
		}
		return retArrayList;
    }
}//end of main
	


