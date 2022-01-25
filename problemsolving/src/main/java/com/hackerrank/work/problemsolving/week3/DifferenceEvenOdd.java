package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class DifferenceEvenOdd {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	ArrayList<Integer> inpArray = new ArrayList<Integer>(firstMultipleInput.length);
	  	   	 	for (int i = 0; i < firstMultipleInput.length; i++) {
					inpArray.add(Integer.valueOf(firstMultipleInput[i]).intValue());
				}
	   	 System.out.println(DifferenceEvenOdd.solve( inpArray));
    }

    public static int  solve(ArrayList<Integer> A)
	{
    	int maxEven = 0;
    	int minOdd = 0;
    	for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Integer number = (Integer) iterator.next();
			if( number !=0 )
			{
				if( number%2==0)
				{
					if(maxEven==0) maxEven = number;
					maxEven = number > maxEven?number:maxEven;
				}
				else
				{
					if(minOdd==0) minOdd = number;
					minOdd = number < minOdd?number:minOdd;
				}		
			}				
		}
    	//System.out.println("maxEven ["+maxEven+"] minOdd["+minOdd+"]");
    	return maxEven-minOdd;
	}
    
    
}