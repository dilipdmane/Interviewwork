package com.hackerrank.work.problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SparseArraysResult {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    	ArrayList<Integer> retList = new ArrayList<Integer>(0);
    	for (int i = 0; i < queries.size(); i++) {
			retList.add(0);
		}
    	Iterator<String> iterator = strings.iterator();
    	while (iterator.hasNext()) {
			String string = (String) iterator.next();
			int index = queries.indexOf(string);
			int querySize = queries.size();
			if( index > -1 )
					{
			//	System.out.println("SparseArraysResult.matchingStrings() "+ string);
						retList.set( index,retList.get( index)+1);
						int lastIndex = queries.lastIndexOf(string);
						while( index !=lastIndex){
							//System.out.println("SparseArraysResult.matchingStrings() indexes" + index);
							index= index+1+queries.subList(index+1, querySize).indexOf(string);
							retList.set( index,retList.get( index)+1);
							}
						
					}	
			}
		
    	return retList;
    }

}

public class SparseArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = bufferedReader.readLine();
            strings.add(stringsItem);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        List<Integer> res = SparseArraysResult.matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

