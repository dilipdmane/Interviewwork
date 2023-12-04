package com.orelly.java8.tcse1;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
class Register {
    
    private static Register register = null;
    
    private HashMap<String, Double> items = null;
    
    private Register() {
		// TODO Auto-generated constructor stub
    	items = new HashMap<String, Double>();
    	
    	items.put("apple", 2.0);
    	items.put("orange", 1.5);
    	items.put("mango", 1.2);
    	items.put("grape", 1.0);
    	
	}
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */

    public String getTotalBill(Map<String,Integer> itemDetails) {
    	
    	double totalBill = 0.0;

    	if (itemDetails !=null && !itemDetails.isEmpty()) {
			Iterator<String> iterator = itemDetails.keySet().iterator();
			while (iterator.hasNext()) {
				String item = (String) iterator.next();				
				totalBill = totalBill+ (itemDetails.get(item)* items.getOrDefault(item, 0.0));				
			}
		}
        
    	return String.valueOf(totalBill);		
    }

    
	public static Register getInstance() {				
		// TODO Auto-generated method stub
		return (register == null ) ? new Register():register;
	}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner readInput = new Scanner(System.in);        
        String[] input=readInput.nextLine().split(" ");                
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
          myItems.put(input[i],Integer.parseInt(input[i+1]));	
        }
        Register regObj = Register.getInstance();        
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();
        
    }
}