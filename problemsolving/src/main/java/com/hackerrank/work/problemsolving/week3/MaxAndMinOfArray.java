package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class MaxAndMinOfArray {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	        //TODO Take second line to next number of element to shift position
	  	   //	 	String b = bufferedReader.readLine().replaceAll("\\s+$", "");
	  	   	 	ArrayList<Integer> inpArray = new ArrayList<Integer>(Integer.valueOf(firstMultipleInput[0]).intValue());
	  	   	 	for (int i = 1; i < firstMultipleInput.length; i++) {
					inpArray.add(Integer.valueOf(firstMultipleInput[i]).intValue());
				}
	  	   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 System.out.println(MaxAndMinOfArray.maxAndMinArray( inpArray));
    }

    public static String maxAndMinArray(ArrayList<Integer> inpArray)
	{
    	int max = inpArray.get(0).intValue();
    	int min = inpArray.get(0).intValue();
    	Iterator<Integer> iterator = inpArray.iterator();
    	
    	while (iterator.hasNext()) {
			Integer number = (Integer) iterator.next();
			
			max = (number>max)?number:max;
			min = (number<min)?number:min;
		}
		
    	return max+" "+min;
		
	}
    
    
}