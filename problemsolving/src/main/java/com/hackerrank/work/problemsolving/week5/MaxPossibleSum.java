package com.hackerrank.work.problemsolving.week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxPossibleSum {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	ArrayList<Integer> inpArray = new ArrayList<Integer>(firstMultipleInput.length);
	  	   	 	for (int i = 1; i < firstMultipleInput.length; i++) {
					inpArray.add(Integer.valueOf(firstMultipleInput[i]).intValue());
				}
	   	 System.out.println(MaxPossibleSum.solve( inpArray,Integer.valueOf(firstMultipleInput[0]).intValue()));
    }

    public static int  solve(ArrayList<Integer> A , int B)
	{
    	int n= A.size();
    	int maxCount = 0;
    	
    	
    	return maxCount;
	}
    
    
}