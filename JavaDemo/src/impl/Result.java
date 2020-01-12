package impl;

import java.util.List;

public class Result {

	/*
	 * Complete the 'maxDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static int maxDifference(List<Integer> arr) {
	    // Write your code here
	    int retVal = -1;
	    int size = (arr != null && !arr.isEmpty())? arr.size():0;
	    double datalimit=2 * (Math.pow(10, 5));
	    if ( size >= 1 && size <= datalimit){      
	      System.out.println(size);
	      int i= 0;
	      int lastminimum = arr.get(0).intValue();
	      for (i = 1; i < size; i++) {
	        int rightValue = arr.get(i).intValue();
	        if (isConstraint(rightValue)) {
	          if (rightValue <= lastminimum) {            
	            lastminimum = rightValue;
	            continue;
	          }
	          int leftValue = lastminimum;
	          if (leftValue < rightValue && isConstraint(leftValue)) {
	            int diff = rightValue - leftValue;
	            if (diff > retVal) {
	              retVal = diff;

	            }
	          }
	        }
	      }
	    }
	    return retVal;
	  }

	public static boolean isConstraint(int number) {
		double uppperLimit = Math.pow(10, 6);
		return (number >= (-1 * uppperLimit) && number <= uppperLimit) ? true : false;
	}

}