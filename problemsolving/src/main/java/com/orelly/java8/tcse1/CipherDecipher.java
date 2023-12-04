package com.orelly.java8.tcse1;

public class CipherDecipher {
	
	public String cipherText( String text )
	{
		String retStr = "";		
		text=text.replaceAll(" ", "*");		
		StringBuilder sb = new StringBuilder(text);		
		byte[] bytes = sb.reverse().toString().getBytes();
		int ctr = 1;		
		sb=new StringBuilder("");		
		for (byte b : bytes) {
			int ch = (char)b;
			if( ch>64 && ch <91)
			{
				ch = ch+32;
			}
			else if (ch>96 && ch <123)
			{
				ch = ch-32;
			}
			
			if( ctr%2 == 0)
			{
				sb.append(Integer.valueOf(ch));
			}
			else
			{
				sb.append((char)ch);
			}
			ctr++;
		}		
		retStr=sb.append("3").toString();		
		return retStr;
	}
	
	
	public String deCipherText( String text )
	{
		StringBuilder sb = new StringBuilder();
		if ( text.endsWith("3"))
		{
			text = text.substring(0, text.length()-1);
		}	
		
		byte[] bytes = text.getBytes();
		String asciiVal = "";
		for (byte b : bytes) {
			int ch = (char)b;
			
			if( ch == 42 ) 
			{
				ch = ' ';
			}
			else if( ch>64 && ch <91)
			{
				ch = ch+32;
			}
			else if (ch>96 && ch <123)
			{
				ch = ch-32;
			}
			else if (ch>47 && ch <58)
			{
				asciiVal = asciiVal+(char)ch;
				continue;
			}
			if( !asciiVal.isEmpty() )
			{
				sb.append(changeCase(Integer.valueOf(asciiVal).intValue()) );
				asciiVal = "";
			}
			sb.append((char)ch);	
		}
		
		if( !asciiVal.isEmpty() )
		{
			sb.append(changeCase(Integer.valueOf(asciiVal).intValue()) );
			asciiVal = "";
		}
		
		return sb.reverse().toString();
	}
	
	public String changeCase (int ch)
	{
		if( ch == 42 ) 
		{
			return " ";
		}
		if( ch>64 && ch <91)
		{
			ch = ch+32;
		}
		else if (ch>96 && ch <123)
		{
			ch = ch-32;
		}
		
		return String.valueOf((char)ch);
	}

}
