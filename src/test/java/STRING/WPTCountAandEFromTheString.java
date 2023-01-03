package STRING;

import java.util.Iterator;

public class WPTCountAandEFromTheString {

	public static void main(String[] args) {
		

		String s="testyantra";
	    char []ch=s.toCharArray();
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
		
			if(ch[i]=='a' || ch[i]=='e') 
			{
				count++;
			}
		}
		System.out.println(count);
	
		}
	}


