package com.hackerrank.work.problemsolving.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class BulbProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       ArrayList<Integer> inpArr = new ArrayList<Integer>(firstMultipleInput.length);
	   	 	for (int i = 0; i < firstMultipleInput.length; i++) {
			inpArr.add(Integer.valueOf(firstMultipleInput[i]).intValue());
		}
	   	 	System.out.println(new BulbProblem().bulbs(inpArr));

	}
	
	public int bulbs(ArrayList<Integer> A) {
		int retCount = 0;
		if(!A.isEmpty()) {
		int newState = A.get(0);
		for (Iterator<Integer> iterator = A.iterator(); iterator.hasNext();) {
			Integer switchValue = (Integer) iterator.next();			
			if( retCount%2==0)
			{
				newState = switchValue;
			}
			else
			{
				newState=switchValue^1;
			}
			if( newState == 0 ) retCount++;
		}
		}
		return retCount;
    }

}
