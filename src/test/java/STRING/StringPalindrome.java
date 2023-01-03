package STRING;

import java.util.Iterator;

public class StringPalindrome {

	public static void main(String[] args) {

         
		String s="madam";
		String ss="";
		for (int i=s.length()-1; i>=0; i--) {
			
			ss=ss+s.charAt(i);
			
		}
		if(s.equals(ss)) 
		{
			System.out.println(" pali");
		}
		else 
		{
			System.out.println("not pali");
		}

	}

}
