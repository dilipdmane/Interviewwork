package com.orelly.java8.tcse1;

public class ChildOne extends Parent
	{
		
		
		public ChildOne(int firstElement, int secondElement) {
			super(firstElement, secondElement);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String filter() {
			String retStr= "";
			for( int i= firstElement;i<=secondElement;i++)
			{
				int count = 0;
				if( i>1)
				{
					for( int n = 1; n<=i/2;n++ )
					{
						if( i%n==0) count++;
					}
					
					if ( count<2) 
					{
						retStr = retStr+i+" ";
					}
				}
				
				
			}
			return retStr.trim();
		}
	}
	
	