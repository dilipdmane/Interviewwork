package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class ReverseArray {
    public static void main(String[] args) throws IOException{
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	ArrayList<Integer> inpArray = new ArrayList<Integer>(firstMultipleInput.length);
	  	   	 	for (int i = 0; i < firstMultipleInput.length; i++) {
					inpArray.add(Integer.valueOf(firstMultipleInput[i]).intValue());
				}
	  	   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 System.out.println(ReverseArray.solve( inpArray));   	 
	   	 
    }

    
    
    public static ArrayList<Integer>  solve(ArrayList<Integer> A)
	{
    	int i = 0;
    	int j = A.size()-1;
    	ArrayList<Integer> retList = new ArrayList<Integer>(A.size());
    	retList.addAll(A);
    	while(i<j)
    	{
    		int val= retList.get(i);
    		retList.set(i, retList.get(j));
    		retList.set(j, val);
    		i++;
    		j--;
    	}
		
    	return retList;
		
	}
}