package com.hackerrank.work.problemsolving;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerrank.work.problemsolving.day13.LengthoflongestConsecutiveOnes;

public class LengthoflongestconsecutiveonesTest {


	@Test
	public void testStringwith_0111110110() {
		assertEquals(new LengthoflongestConsecutiveOnes().solve("0111110110"), 7);
	}
	
	@Test
	public void testStringwith_1101010() {
		assertEquals(new LengthoflongestConsecutiveOnes().solve("1101010"), 4);
	}
	
	
	@Test
	public void testStringwithOnly1() {
		assertEquals(new LengthoflongestConsecutiveOnes().solve("1"), 1);
	}
	
	@Test
	public void testStringwithOnly0() {
		assertEquals(new LengthoflongestConsecutiveOnes().solve("0"),0);
	}
	

}
