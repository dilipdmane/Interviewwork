package com.hackerrank.work.problemsolving.week7.day22;

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
 * You are given an array of N integers, A1, A2 ,…, AN and an integer B. Return the of count of distinct numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
NOTE: if B > N, return an empty array.</b>.</p>
<p>
<h1>Problem Constraints</h1>
1 <= N <= 10^5<br/>
1 <= A[i] <= 10^9
</p>
 *
 */
public class DistinctNumbersinWindow {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);        
      
	}
	
	
	 public ArrayList<Integer> solve(ArrayList<Integer> A , int B) {
		 ArrayList<Integer> retList = new ArrayList<>(0);
		 if( A.size() >=B )
		 {
			 HashMap<Integer, Integer> freAMap = new HashMap<>();//TODO To hold number count
			  for ( int i=0; i <B; i++ ) {				 
				 Integer num = A.get(i);
				 if( freAMap.containsKey(num))
				 {
					 freAMap.put(num, freAMap.get(num).intValue()+1);
				 }
				 else
				 {
					 freAMap.put(num,1);
				 }			 
			 }
			 retList.add(freAMap.size());
			 int j= 0; 
			 for( int i=1;i<= (A.size()-B) ;i++)
			 {
				  j = i+B-1;
				 freAMap.put(A.get(i-1), freAMap.get(A.get(i-1))-1);
				 
				 if( freAMap.get(A.get(i-1).intValue()) == 0 )
				{
					 			freAMap.remove(A.get(i-1));
				}
				 
				 Integer num = A.get(j);
				 if( freAMap.containsKey(num))
				 {
					 freAMap.put(num, freAMap.get(num).intValue()+1);
				 }
				 else
				 {
					 freAMap.put(num,1);
				 }
				 retList.add(freAMap.size());
			 }
		 }
		 return retList;
	    }
}
