package com.hackerrank.work.problemsolving.week6.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class LowerCase {

	public static void main2(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inpArr = bufferedReader.readLine().replaceAll("\\s+$", "");        
        ArrayList<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < inpArr.length(); i++) {
			charList.add(Character.valueOf(inpArr.charAt(i)));
			System.out.println( (int)charList.get(i).charValue());
		}
		System.out.println(new LowerCase().to_lower(charList));
	}
	
	
	public ArrayList<Character> to_lower(ArrayList<Character> A) {
		int ctr = 0;
		for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			int ascii = (int )character.charValue();
			if( ascii >=65 && ascii<=90)
			{
				char ch = (char)(ascii+32);
				A.set(ctr, Character.valueOf((ch)));
			}
			ctr++;
		}
		
		return A;
    }
	
	
	public ArrayList<Character> to_upper(ArrayList<Character> A) {
		int ctr = 0;
		for (Iterator iterator = A.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			int ascii = (int )character.charValue();
			if( ascii >=97 && ascii<=122)
			{
				char ch = (char)(ascii-32);
				A.set(ctr, Character.valueOf((ch)));
			}
			ctr++;
		}
		
		return A;
    }
	    
	
	 public int solve(ArrayList<Character> A) {
		 
			for (Iterator iterator = A.iterator(); iterator.hasNext();) {
				Character character = (Character) iterator.next();
				int ascii = (int )character.charValue();
				if( !(ascii >=65 && ascii<=122))
				{
					return 0;
				}
				
			}
			return 1;
	    }
	 
	 public static void main(String[] args)  {
		 
		 for (int i = 40; i < 130; i++) {
			System.out.println("["+  i +"] => "+(char)i);
			
		}
		 
	 }
	 

}
