package com.hackerrank.work.problemsolving.week7.day19.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import com.hackerrank.work.problemsolving.Utility;

/***
 * 
 * @author jyodak
 *         <p>
 *         <h1>Problem Description</h1> Given an array with N objects colored
 *         red, white, or blue, sort them so that objects of the same color are
 *         adjacent, with the colors in the order red, white, and blue.</br>
 *         We will use the integers 0, 1, and 2 to represent red, white, and
 *         blue, respectively. </br>
 *         </br>
 *         Note: <b>Using the library sort function is not allowed.</b>
 *         </p>
 *         <p>
 *         <h1>Problem Constraints</h1> 1 <= |A| <= 2*105 1 <= A[i] <= 107
 *         </p>
 *
 */
public class CheckIfArithmatic {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstAInput[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		System.out.println(
				new CheckIfArithmatic().solve(Utility.getInstance().convertStringArraytoIntArrayList(firstAInput)));

	}

	public int solve(ArrayList<Integer> A) {
		
		A.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer left, Integer right) {
				return (left.intValue()) - (right.intValue());
			}
		});

		int diff = A.get(1).intValue() - A.get(0).intValue();

		for (int i = 1; i < A.size(); i++) {
			// TODO handle if array contains same element multiple time
			if (A.get(i).intValue() - A.get(i - 1).intValue() != diff) {
				return 0;
			}
		}

		return 1;
	}

}
