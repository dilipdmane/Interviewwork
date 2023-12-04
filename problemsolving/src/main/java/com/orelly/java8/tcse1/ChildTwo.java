package com.orelly.java8.tcse1;
public class ChildTwo extends Parent
	{
		public ChildTwo(int firstElement, int secondElement) {
			super(firstElement, secondElement);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String filter() {
			String retStr= "";
			for( int i= firstElement;i<=secondElement;i++)
			{
				if( isHappynumber(i))
				{
					retStr = retStr+i+" ";
				}
			}
			 return retStr.trim();
		}
		
		
		 public boolean isHappynumber(int n) {
		        if (n == 1 || n == 7)
		            return true;
		        int sum = n, x = n;
		 
		        // this loop executes till the sum of square of
		        // digits obtained is not a single digit number
		        while(sum > 9) {
		            sum = 0;
		 
		            // this loop finds the sum of square of digits
		            while (x > 0) {
		                int d = x%10;
		                sum += d*d;
		                x/=10;
		            }
		            if (sum == 1)
		                return true;
		            x = sum;
		        }
		        if(sum == 7)
		            return true;
		        return false;
		    }
	}