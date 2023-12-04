package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.orelly.java8.tcse1.ChildOne;
import com.orelly.java8.tcse1.CipherDecipher;
import com.orelly.java8.tcse1.Parent;
import com.orelly.java8.tcse1.Polymorphism;

public class TCSE1 
{
	private static CipherDecipher CIPHER = null;
	private static Polymorphism POLYMORPHISM = null;
	
	@Before
	public void intialize()
	{
		CIPHER = ( CIPHER == null) ? new CipherDecipher() : CIPHER;		
	}

	@Test
	public void testCipher() {
		String inp = "Dilip Mane";
		String out = "E78A109*80I76I1003";
		assertEquals(out, CIPHER.cipherText(inp));
	}
	
	@Test
	public void testdeCipher() {
		String inp = ".78E72T42U79Y42E69s3";
		String out = "See you then.";
		assertEquals(out, CIPHER.deCipherText(inp));
	}
	
	@Test
	public void testCipher_1() {
		String inp = "Dilip Mane";
		String out = "E78A109*80I76I1003";
		assertEquals(out, CIPHER.cipherText(inp));
	}
	
	@Test
	public void testchildOne_Filter() {
		int inpStart = 0;
		int inpEnd = 10;
		String outStr = "2 3 5 7";
		Parent childone = new ChildOne(inpStart, inpEnd);		
		assertEquals(outStr, childone.filter());
		
	}
	
	@Test
	public void testchildOne_Filter1_100() {
		int inpStart = 0;
		int inpEnd = 100;
		String outStr = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97";
		Parent childone = new ChildOne(inpStart, inpEnd);		
		assertEquals(outStr, childone.filter());
		
	}
	
	@Test
	public void testchildOne_Filter1_1000() {
		int inpStart = 0;
		int inpEnd = 1000;
		String outStr = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499 503 509 521 523 541 547 557 563 569 571 577 587 593 599 601 607 613 617 619 631 641 643 647 653 659 661 673 677 683 691 701 709 719 727 733 739 743 751 757 761 769 773 787 797 809 811 821 823 827 829 839 853 857 859 863 877 881 883 887 907 911 919 929 937 941 947 953 967 971 977 983 991 997";
		Parent childone = new ChildOne(inpStart, inpEnd);		
		assertEquals(outStr, childone.filter());
		
	}

}
