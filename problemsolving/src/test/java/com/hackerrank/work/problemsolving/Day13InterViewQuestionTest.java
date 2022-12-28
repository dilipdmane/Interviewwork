package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day13.ChristmasTrees;
import com.hackerrank.work.problemsolving.day13.MaximumPositivity;

@Ignore
public class Day13InterViewQuestionTest {
	
	private static ChristmasTrees CHRISMASTREE_INST = null;
	private static MaximumPositivity MAXPOSITIVITY_INST = null;
	
	
	@Before
	public void intialize()
	{
		CHRISMASTREE_INST = ( CHRISMASTREE_INST == null) ? new ChristmasTrees() : CHRISMASTREE_INST;
		MAXPOSITIVITY_INST = ( MAXPOSITIVITY_INST == null) ? new MaximumPositivity() : MAXPOSITIVITY_INST;
	}

	@Test
	public void testChrismasTreeTest() {
		int[] TREE_HEIGHT = new int[]{1, 6, 4, 2, 6, 9};
		int[] TREE_COST = new int[]{2, 5, 7, 3, 2, 7};
		assertEquals(7,CHRISMASTREE_INST.solve(TREE_HEIGHT, TREE_COST));
	}
	
	@Test
	public void testChrismasTreeTest2() {
		int[] TREE_HEIGHT = new int[]{1, 3, 5};
		int[] TREE_COST = new int[]{1,2,3};
		assertEquals(6,CHRISMASTREE_INST.solve(TREE_HEIGHT, TREE_COST));
	}
	
	@Test
	public void testMaxPositivityTest1NegativeNumbers() {
		int[] INP_ARRAY = new int[]{5, 6, -1, 7, 8,9,-2};
		int[] EXP_ARRAY = new int[]{7, 8,9};
		assertArrayEquals(EXP_ARRAY,MAXPOSITIVITY_INST.solve(INP_ARRAY));
	}
	
	@Test
	public void testMaxPositivityTest1NegativeNumberstart() {
		int[] INP_ARRAY = new int[]{-5, 6, -1, 7, 8,9,-2};
		int[] EXP_ARRAY = new int[]{7, 8,9};
		assertArrayEquals(EXP_ARRAY,MAXPOSITIVITY_INST.solve(INP_ARRAY));
	}
	
	@Test
	public void testMaxPositivityTest1NegativeNumbersWithSameMaxArray() {
		int[] INP_ARRAY = new int[]{5, 6, -1, 7, 8};
		int[] EXP_ARRAY = new int[]{5,6};
		assertArrayEquals(EXP_ARRAY,MAXPOSITIVITY_INST.solve(INP_ARRAY));
	}
	
	@Test
	public void testMaxPositivityTest1TwoNegativeNumbersWithSameMaxArray() {
		int[] INP_ARRAY = new int[]{5, 6, -1, -7, 8};
		int[] EXP_ARRAY = new int[]{5,6};
		assertArrayEquals(EXP_ARRAY,MAXPOSITIVITY_INST.solve(INP_ARRAY));
	}
	
	@Test
	public void testMaxPositivityTest1NonNegativeArray() {
		int[] INP_ARRAY = new int[]{1, 2, 3, 4, 5, 6};
		int[] EXP_ARRAY = new int[]{1, 2, 3, 4, 5, 6};
		assertArrayEquals(EXP_ARRAY,MAXPOSITIVITY_INST.solve(INP_ARRAY));
	}

}
