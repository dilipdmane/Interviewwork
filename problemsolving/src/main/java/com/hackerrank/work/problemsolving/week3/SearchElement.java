package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class SearchElement {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int noOfTest = Integer.valueOf(bufferedReader.readLine().replaceAll("\\s+$", "")).intValue();
          
          int[] searchelements = new int[noOfTest];
          int[][] searchArr = new int[noOfTest][];
          
          for ( int i=0;i<noOfTest;i++)
          {
        	  String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        	  int[] array = new int[ Integer.valueOf(firstMultipleInput[0]).intValue()];
        	  for (int j = 0; j < array.length; j++) {
				array[j] = Integer.valueOf( firstMultipleInput[j+1]).intValue();
			}
        	  searchArr[i] = array;
        	  String element = bufferedReader.readLine().replaceAll("\\s+$", "");
        	  searchelements[i] = Integer.valueOf(element).intValue();
        	  
          }
           	 		   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 SearchElement.searchElements( noOfTest, searchelements,searchArr);
    }

	private static void searchElements(int noOfTest, int[] searchelements, int[][] searchArr) {
		
		for( int i=0;i<noOfTest;i++)
		{
			int num = searchelements[i];
			int found = 0;
			int[] arr = searchArr[i];
			
			for (int j = 0; j < arr.length; j++) {
				if( num == arr[j])
				{
					found = 1;
					System.out.println( found);
					break;
				}
			}
			if(found == 0) System.out.println("0");
		}
	}
	/**
	 * Find the 
	 * @param A
	 * @param B
	 * @return
	 */
	  public int solve(ArrayList<Integer> A, int B) {
	        int count = -1;
	        Iterator<Integer> iterator = A.iterator();
	        while (iterator.hasNext()) {
				Integer number = (Integer) iterator.next();
				if( number>B)count++;
			}
	        return count;
	    }
	

   
}