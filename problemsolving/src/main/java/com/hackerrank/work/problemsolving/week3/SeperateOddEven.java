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
        	  inpArr[i] = firstMultipleInput;
          }
	   	 SeperateOddEven.searchElements( noOfTest, inpArr);
    }

	private static void searchElements(int noOfTest, String[][] inpArr) {
		for( int i=0;i<noOfTest;i++)
		{
			StringBuilder evenStr = new StringBuilder("");
			StringBuilder oddStr= new StringBuilder("");
			String sep = " ";
			String[] arr = inpArr[i];			
			for (int j = 0; j < arr.length; j++) {
				int number= Integer.valueOf(arr[j]).intValue();
				if( number!=0)
				{
						if( number%2==0)
						{
							//evenStr = evenStr+number+" ";
							evenStr.append(number).append(sep);
						}
						else
						{
							//oddStr = oddStr+number+" ";
							oddStr.append(number).append(sep);
						}
				}
			}//end of for
			System.out.println(oddStr.toString());
			System.out.println(evenStr.toString());			
		}
	}
}