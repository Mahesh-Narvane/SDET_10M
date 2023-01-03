package INTERVIEW;

import java.util.Iterator;

public class removespecialcharacterfromstring
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		  String str="na@bhf*&vD#";
		  String s="";

		for (int i = 0; i <str.length(); i++) 
		{
			if(str.charAt(i)>97 && str.charAt(i)<122)
			{
				s=s+str.charAt(i);
			}
		}
		     System.out.println(s);
	}
}


