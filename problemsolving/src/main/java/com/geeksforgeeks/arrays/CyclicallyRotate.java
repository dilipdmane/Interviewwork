package com.geeksforgeeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author jyodak
 * Given an array, rotate the array by one position in clock-wise direction.
 */
public class CyclicallyRotate {

	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));      

        String noOfEle = bufferedReader.readLine().replaceAll("\\s+$", "");
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int[] inpArr = new int[ firstMultipleInput.length];
        for (int i = 0; i < inpArr.length; i++) {
			inpArr[i]= Integer.valueOf(firstMultipleInput[i]);
		}        
        new CyclicallyRotate().rotate(inpArr, Integer.valueOf(noOfEle));      
        for (int i = 0; i < inpArr.length; i++) {
			System.out.print(inpArr[i] + " " );
		}
	}

    
    public void rotate(int arr[], int n)
    {
        int last = arr[n-1];       
         for( int i= n-1; i>0;i--)
        {
        	arr[i]= arr[i-1];
        }
        arr[0]=last;        
    }	

}
