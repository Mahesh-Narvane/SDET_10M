package INTERVIEW;

import java.util.Arrays;

public class anagramStringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s= "race";
		char[] s1 = s.toCharArray();
		String s2= "face";
		char[] s3 = s2.toCharArray();
		
		 Arrays.sort(s1);
		 Arrays.sort(s3);
		 
		 
		 boolean result = Arrays.equals(s1, s3);
		 System.out.println(result);
 if(result) 
 {
	 System.out.println(s+" "+s2+  " are anagram");
 }
 else
 {
	 System.out.println(s+" "+s2+  " are not anagram");
 }
	
	}

}
