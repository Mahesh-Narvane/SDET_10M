package INTERVIEW;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseStringUsingRecursionMethod {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a string");
	    String str = sc.next();
	    char[] ch=str.toCharArray();
	    int length=ch.length;
	    reverseString(ch,length);
	}
	
	public static void reverseString(char[]ch,int length)
	{
		if(length>0) 
		{
			System.out.print(ch[length-1]);
			length--;
			reverseString(ch, length);
		}
	}	

	
}
