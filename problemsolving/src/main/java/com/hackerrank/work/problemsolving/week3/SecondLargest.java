package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargest {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int noOfTest = Integer.valueOf(bufferedReader.readLine().replaceAll("\\s+$", "")).intValue();
          int[][] searchArr = new int[noOfTest][];
          for ( int i=0;i<noOfTest;i++)
          {
        	  String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        	  int[] array = new int[ Integer.valueOf(firstMultipleInput[0]).intValue()];
        	  for (int j = 0; j < array.length; j++) {
				array[j] = Integer.valueOf( firstMultipleInput[j+1]).intValue();
			}
        	  searchArr[i] = array;
          }
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 SecondLargest.getSecondLargest( noOfTest,searchArr);
    }

	private static void getSecondLargest(int noOfTest, int[][] searchArr) {
		for( int i=0;i<noOfTest;i++)
		{
			int found = 0;
			int[] arr = searchArr[i];
			int max= arr[0];
			int secondLargest = arr[0];
			if( arr.length > 1)
			{
				for (int j = 0; j < arr.length; j++) {
					if( arr[j]>secondLargest)
					{
						if( arr[j] >max)
						{
							secondLargest = max;
							max= arr[j];
						}
						else
						{
							secondLargest = arr[j];	
						}
					}
				}			
				found = 1;
				System.out.println(secondLargest);
			}
			else
			{
				found = 0;
			}
			if(found == 0) System.out.println("-1");
		}
	}


   
}