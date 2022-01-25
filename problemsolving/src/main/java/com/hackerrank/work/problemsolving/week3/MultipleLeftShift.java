package com.hackerrank.work.problemsolving.week3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultipleLeftShift {
    public static void main(String[] args) throws IOException{

          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          String[] inpArr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
          ArrayList<Integer> A = new ArrayList<>();
          for (int i = 0; i < inpArr.length; i++) {
        	  int number = Integer.parseInt(inpArr[i]);
              A.add(number);
		}
          String[] shiftArr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
          ArrayList<Integer> B = new ArrayList<>();
          for (int i = 0; i < shiftArr.length; i++) {
        	  int number = Integer.parseInt(shiftArr[i]);
              B.add(number);
		}
          
	        //int n = Integer.parseInt(firstMultipleInput[0]);	        
	   	 MultipleLeftShift.solve( A,B);
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    	ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();
    	int noOfelements =  A.size();
    	retList = new ArrayList<ArrayList<Integer>>(B.size());
    	for (Iterator iterator = B.iterator(); iterator.hasNext();) {
			Integer b = (Integer) iterator.next();
			if(b > noOfelements)
			{
				b = b%noOfelements;
			}			
			if( b > 0 )
			{
				ArrayList<Integer> list = new ArrayList<Integer>();
				int start = noOfelements-(b-1);
				 for(int i=b;i< noOfelements;i++)
				 {
					 list.add( A.get(i));
					 //System.out.printin(A.get(i)+" ");
					 
				 }
				 for( int i=0;i<b;i++)
				 {
					 //					 System.out.println(A.get(i)+" ");
					 list.add( A.get(i));
				 }				 
				 retList.add(list);
			}
			else
			{
				retList.add(A);
			}
		}
    	System.out.println("MultipleLeftShift.solve() ["+retList+"]");
    	return retList;
    }
}