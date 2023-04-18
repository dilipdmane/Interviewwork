package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day22.SubarrayWithGivenSum;

public class Day22HashingPart2Test {
	
	private static SubarrayWithGivenSum SUB_ARRAY_SUM = null;
	
	
	@Before
	public void intialize()
	{
		SUB_ARRAY_SUM = ( SUB_ARRAY_SUM == null) ? new SubarrayWithGivenSum() : SUB_ARRAY_SUM;
	}

	@Test
	public void testSolve_postive() {
		int[] inp = new int[] {1, 2, 3, 4, 5};
		int B = 5;
		int[] out = new int[] {2,3};
		assertArrayEquals(inp, out);;
	}
	
	@Test
	public void testSolve_negative() {
		int[] inp = new int[] {5, 10, 20, 100, 105};
		int B = 110;
		int[] out = new int[] {-1};
		assertArrayEquals(inp, out);
	}

}
