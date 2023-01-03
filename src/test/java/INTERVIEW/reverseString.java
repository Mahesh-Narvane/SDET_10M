package INTERVIEW;

import java.util.Iterator;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		 String str=" Mahesh ";
		 
          char[] ch = str.toCharArray();
          String ss="";
		 for (int i =ch.length-1; i>0; i--) {
			
			 ss=ss+ch[i];
		}
		 System.out.print(ss);
		 
		 
		 
	}
}
