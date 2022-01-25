package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class CheckGoodPair {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        //TODO Take First line using buffer reader and seperate element by space.
	        String[] inpArray = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	        //TODO Take second line to next number of element to shift position
	  	   	 	String sumToMatch = bufferedReader.readLine().replaceAll("\\s+$", "");	   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 System.out.println(CheckGoodPair.checkPari(Integer.valueOf(sumToMatch).intValue(),inpArray));
    }

    public static int  checkPari( int sum, String[] inpArry)
	{
    	for( int i=0 ;i<inpArry.length;i++)
    	{
    		for( int j=i+1;j<inpArry.length;j++)
    		{
    			if( sum == Integer.valueOf( inpArry[i]).intValue() + Integer.valueOf(inpArry[j]).intValue())
    			{
    				return 1;
    			}
    		}
    	}
    	return 0; 
	}
    
    public int solve(ArrayList<Integer> A, int B) {
        for( int i=0 ;i<A.size();i++)
    	{
    		for( int j=i+1;j<A.size();j++)
    		{
    			if( B == A.get(i).intValue()+A.get(j).intValue())
    			{
    				return 1;
    			}
    		}
    	}
    	return 0; 
    }
}