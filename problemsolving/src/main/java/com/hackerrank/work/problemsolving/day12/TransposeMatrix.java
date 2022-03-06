package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class TransposeMatrix {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       int rows = Integer.valueOf(firstMultipleInput[0]).intValue();
       int columns = Integer.valueOf(firstMultipleInput[0]).intValue();       
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
       new TransposeMatrix().solve(inpArray);

	}// end of main
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		
		for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			ArrayList<Integer> arrayList = (ArrayList<Integer>) iterator.next();
			System.out.print("[ ");
			for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
				Integer integer = (Integer) iterator2.next();
				System.out.print(integer+", ");	
			}
			System.out.print("[ ");
		}
		return null;
    }
       
       
	}
	


