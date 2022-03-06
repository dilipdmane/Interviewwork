/**
 * 
 */
package com.hackerrank.work.problemsolving;

import java.util.ArrayList;

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

}
