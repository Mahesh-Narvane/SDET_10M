package INTERVIEW;

import java.util.Iterator;

public class stringpali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="madam";
		String s="";
	
	for (int i =str.length()-1; i>=0; i--) {
		
		s=s+str.charAt(i);
		
	}
	if(str.equals(s)) 
	{
		System.out.println(str+"   = String is palimdrome");
	}
	else 
	{
		System.out.println(str +"  = String is not a palindrome");
	}
	
		
	}
}
