package INTERVIEW;

import java.util.Iterator;

public class secondMethodForStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String s="mam";
		int i=0;
		int j=s.length()-1;
		
		for ( i = 0; i <s.length(); i++)
		{
			for ( j = 0; j <s.length(); j++) {
				
			 if(s.charAt(i)!=s.charAt(j)) 
			 {
				 System.out.println("is not palindrome");
				 System.exit(0);
			 }
			 i++;
			 j--;
			 }
		}
		System.out.println(" is palindrome");
	}

}
