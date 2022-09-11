package com.hackerrank.work.problemsolving.week7.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.hackerrank.work.problemsolving.Utility;

/***
 * 
 * @author jyodak
 * Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 *
 */
public class CommonElement {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        String[] secondAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> B = Utility.getInstance().convertStringArraytoIntArrayList(secondAInput);
        ArrayList<Integer> solve = new CommonElement().solve(A, B);
        for (Iterator iterator = solve.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer+" ");
		}

	}
	
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> retList = new ArrayList<>(0);		
		HashMap<Integer, Integer> freAMap = new HashMap<>();//TODO To hold number count
		HashMap<Integer, Integer> freBMap = new HashMap<>();
		
		for (Iterator<Integer> iterator = A.iterator(); iterator.hasNext();) {
			Integer element = (Integer) iterator.next();
			if( !freAMap.containsKey(element))
			{
				freAMap.put(element, 1);
				continue;
			}
			freAMap.put(element, freAMap.get(element).intValue()+1);			
		}		
		for (Iterator<Integer> iterator = B.iterator(); iterator.hasNext();) {
			Integer element = (Integer) iterator.next();
			if( !freBMap.containsKey(element))
			{
				freBMap.put(element, 1);
				continue;
			}
			freBMap.put(element, freBMap.get(element).intValue()+1);			
		}		
		 Iterator<Integer> iterator = freAMap.keySet().iterator();
		 while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			if (freBMap.containsKey(integer))
			{
				int count = Math.min(freAMap.get(integer), freBMap.get(integer));
				for( int i=0; i<count;i++)
				{
					retList.add(integer);
				}				
			}
		}			
		return retList;
    }

}
