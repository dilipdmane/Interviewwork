package com.hackerrank.work.problemsolving.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.hackerrank.work.problemsolving.Utility;

/**
 * 
 * @author jyodak
 *
 */
public class ChristmasTrees {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       String[] firstMultipleInput2 = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       
       int[] array1 = new int[firstMultipleInput.length];
       int[] array2 = new int[firstMultipleInput2.length];
       
       for (int i = 0; i < firstMultipleInput.length; i++) array1[i] = Integer.valueOf(firstMultipleInput[i]).intValue(); 
       for (int i = 0; i < firstMultipleInput2.length; i++) array2[i] = Integer.valueOf(firstMultipleInput2[i]).intValue();
	
       
		
        Utility.getInstance().printData(new ChristmasTrees().solve(array1,array2), System.out);
       
       
	
}//end of main

	/**
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public int solve(int[] A, int[] B) {
		int retVal = 0;
		return retVal;
    }
}//end of class

