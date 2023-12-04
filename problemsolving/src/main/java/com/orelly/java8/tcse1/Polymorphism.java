package com.orelly.java8.tcse1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String startElement = bufferedReader.readLine();
			String endElement = bufferedReader.readLine();
			
			ChildOne childOne = new ChildOne(Integer.valueOf(startElement).intValue(), Integer.valueOf(endElement).intValue());
			
			System.out.println();
			
			
		} catch (IOException e) {

		}

	}
	
	
	

}
