package INTERVIEW;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeDuplictaeFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
		String str= "jashfbakkjdskh";
		String s="";
		for (int i = 0; i <str.length(); i++) {

			char ch = str.charAt(i);
			if(s.indexOf(ch)==-1) 
			{
				s=s+ch;
				
			}

		}

		System.out.println(s+"");


	}

}
