package INTERVIEW;

import java.util.Iterator;

public class Istring {

	public static void main(String[] args)
	{
		String str="mahesh";
		String s="";
        String r="";
		for (int i = str.length()-1; i>=0; i--)
		{
			s=s+str.charAt(i);   

		}
		System.out.println(s);
	  String bbb = str.substring(1,4);   
	  
	  for (int i =bbb.length()-1;i>=0; i--) {
		  
		  r=r+bbb.charAt(i);
		
	}
	  if(r.equals(bbb)) {
		  System.out.println("is palindrome");
	  }
	}

}
