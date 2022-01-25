package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class SeperateOddEven {
    public static void main(String[] args) throws IOException{

          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int noOfTest = Integer.valueOf(bufferedReader.readLine().replaceAll("\\s+$", "")).intValue();
          
          int[] searchelements = new int[noOfTest];
          String[][] inpArr = new String[noOfTest][];
          
          for ( int i=0;i<noOfTest;i++)
          {
        	  String elements = bufferedReader.readLine().replaceAll("\\s+$", "");
        	  String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        	  /*int[] array = new int[ Integer.valueOf(elements).intValue()];
        	  for (int j = 0; j < array.length; j++) {
				array[j] = Integer.valueOf( firstMultipleInput[j]).intValue();
        	  }*/
        	  inpArr[i] = firstMultipleInput;
          }
           	 		   	 	
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 SeperateOddEven.searchElements( noOfTest, inpArr);
    }

	private static void searchElements(int noOfTest, String[][] inpArr) {
		for( int i=0;i<noOfTest;i++)
		{
			String evenStr = "";
			String oddStr="";
			String[] arr = inpArr[i];			
			for (int j = 0; j < arr.length; j++) {
				int number= Integer.valueOf(arr[j]).intValue();
				if( number!=0)
				{
						if( number%2==0)
						{
							evenStr = evenStr+number+" ";									
						}
						else
						{
							oddStr = oddStr+number+" ";
						}
				}
			}//end of for
			System.out.println(oddStr);
			System.out.println(evenStr);			
		}
	}
}