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
 * <p>
 * <h1>Problem Description</h1>
 * Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of first occurrence is smallest.
If there is no repeating element, <b>return -1</b>.</p>
<p>
<h1>Problem Constraints</h1>
1 <= N <= 10^5<br/>
1 <= A[i] <= 10^9
</p>
 *
 */
public class FirstRepeatingElements {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);        
        System.out.println(new FirstRepeatingElements().solve(A));
	}
	
	
	 public int solve(ArrayList<Integer> A) {
		 int ret = -1;
		 HashMap<Integer, Integer> freAMap = new HashMap<>();//TODO To hold number count		
			
			for (Iterator<Integer> iterator = A.iterator(); iterator.hasNext();) {
				Integer element = (Integer) iterator.next();
				if( !freAMap.containsKey(element))
				{
					freAMap.put(element, 1);
					continue;
				}
				freAMap.put(element, freAMap.get(element).intValue()+1);			
			}
			for (Iterator iterator = A.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if( freAMap.get(integer).intValue()>1)
				{
					return integer.intValue();
				}				
			}		 
		 return ret;
	    }
}
