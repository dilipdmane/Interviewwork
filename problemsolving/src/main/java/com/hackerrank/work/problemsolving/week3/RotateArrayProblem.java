package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RotateArrayProblem {
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
	  	   	 	String b = bufferedReader.readLine().replaceAll("\\s+$", "");	   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 RotateArrayProblem.rotateArray(Integer.valueOf(b).intValue(),firstMultipleInput);
    }

    public static void rotateArray( int b, String[] inpArry)
	{
		int noOfelements = Integer.valueOf(inpArry[0]).intValue();
		
		if(b > noOfelements)
		{
			b = b%noOfelements;
		}
		
		if( b > 0 )
		{
			int start = noOfelements-(b-1);
			 for(int i=start;i<= noOfelements;i++)
			 {
				 System.out.print(inpArry[i]+" ");
			 }
			 for( int i=1;i<start;i++)
			 {
				 System.out.print(inpArry[i]+" ");
			 }
		}
	}
}