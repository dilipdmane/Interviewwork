package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day13.ChristmasTrees;

public class ChrismasTreeTest {
	
	private static ChristmasTrees INST = null;
	
	
	
	@Before
	public void intialize()
	{
		INST = ( INST == null) ? new ChristmasTrees() : INST; 
	}

	@Ignore
	public void testChrismasTreeTest() {
		int[] TREE_HEIGHT = new int[]{1, 6, 4, 2, 6, 9};
		int[] TREE_COST = new int[]{2, 5, 7, 3, 2, 7};
		assertEquals(7,INST.solve(TREE_HEIGHT, TREE_COST));
	}
	
	@Test
	public void testChrismasTreeTest2() {
		int[] TREE_HEIGHT = new int[]{1, 3, 5};
		int[] TREE_COST = new int[]{1,2,3};
		assertEquals(6,INST.solve(TREE_HEIGHT, TREE_COST));
	}

}
