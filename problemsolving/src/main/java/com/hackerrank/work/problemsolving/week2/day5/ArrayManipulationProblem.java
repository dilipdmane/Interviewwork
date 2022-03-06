package com.hackerrank.work.problemsolving.week2.day5;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultArrayManipulationProblem {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        //TODO Initialize Array
        long retNum = 0;
            long[]  retList = new long[n+2];       
            Iterator<List<Integer>> iterator2 = queries.iterator();           
            while (iterator2.hasNext()) {
                List<java.lang.Integer> list = (List<java.lang.Integer>) iterator2.next();        
                int a= list.get(0);
                int b= list.get(1);
                int k = list.get(2);
                retList[a]=  retList[a]+k;
                retList[b+1]=  retList[b+1]-k;
            }
            
            for (int i = 1; i < retList.length; i++) {
                long currentNum = retList[i-1]+retList[i];
                retList[i]=currentNum;
                
                if(currentNum > retNum)
                {
                    retNum = currentNum;
                }
            }
return retNum;
    }// end of arrayManipulation
    
    public static long arrayManipulation_new(int n, List<List<Integer>> queries) {
    	// Write your code here
    		//TODO Initialize Array
    		long retNum = queries.get(0).get(2);
    		int prvUpperLimit= queries.get(0).get(1);
    		int prvLowerLimit=queries.get(0).get(0);
    		int[]  retList = new int[n] ;   	
    		int size=queries.size();
    		 for (int i = 1; i < size ;i++) {
    			int lowerLimit = queries.get(i).get(0);
    			int upperLimit = queries.get(i).get(1);
    			int sum = queries.get(i).get(2);
    			if( lowerLimit<=prvUpperLimit  && upperLimit >=prvLowerLimit)
    			{
    				retNum = retNum+sum;
    			}
    			else
    			{
    				if( sum > retNum)
    					retNum = sum;
    			}
    			prvLowerLimit = lowerLimit;
    			prvUpperLimit = upperLimit;
			}    	
    		return retNum;
    	}
}




public class ArrayManipulationProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> queriesRowItems = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }
            queries.add(queriesRowItems);
        }
        long result = ResultArrayManipulationProblem.arrayManipulation(n, queries);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
