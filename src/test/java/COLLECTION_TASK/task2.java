package COLLECTION_TASK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task2
{

	
	public static void main(String[] args) {
		
		
		
		String s = "india";
		int count=0;
		
		
		LinkedHashSet<Character> l = new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			l.add(s.charAt(i));
		}
		
		//System.out.println(l);
		
		for (Character ch : l) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				count++;
			}
		}
		System.out.println(s+" "+count);
	}
}
