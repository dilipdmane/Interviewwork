/**
 * 
 */
package com.hackerrank.work.problemsolving;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author jyodak
 *
 */
public class Utility {
	
	private static final Utility THIS_INST = new Utility();
	
	private Utility() {
		// TODO Auto-generated constructor stub
	}
	
	public static Utility getInstance()
	{
		return THIS_INST;
	}
	
	public ArrayList<Integer> convertStringArraytoIntArrayList( String[] inpArray)
	{
		ArrayList<Integer> retList = null;
		if( inpArray !=null && inpArray.length>0)
		{
			retList = new ArrayList<>(inpArray.length);
			for (int i = 0; i < inpArray.length; i++) {
				retList.add(Integer.valueOf(inpArray[i]) );
			}
		}
		return retList;
		
	}
	
	public void printMatrix(ArrayList<ArrayList<Integer>> A, PrintStream out) {
		
		if( A !=null && !A.isEmpty()) {
			
			for (Iterator<ArrayList<Integer>> iterator = A.iterator(); iterator.hasNext();) {
				ArrayList<Integer> arrayList = (ArrayList<Integer>) iterator.next();
				out.print("|");
				for (Iterator<Integer> iterator2 = arrayList.iterator(); iterator2.hasNext();) {
					Integer integer = (Integer) iterator2.next();
					out.print(" "+integer+" ");
				}
				out.print("|");
				out.print("\n");
			}
			
		}
		
	}
	
public void printMatrix( int[][] A, PrintStream out) {
		
		if( A !=null && A.length>0) {
			for (int i = 0; i < A.length; i++) {
				int[] js = A[i];
				out.print("|");
				for (int j = 0; j < js.length; j++) {
					out.print(" "+js[j]+" ");
				}
				out.print("|");
				out.print("\n");
			}
			
		}
		
	}

public void printMatrix( int[] A, PrintStream out) {
	
	if( A !=null && A.length>0) {
		for (int i = 0; i < A.length; i++) {
			
			out.print("|");
			out.print(A[i]);
			out.print("|");
			out.print("\n");
		}
		
	}
	
}

}
