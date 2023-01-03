package COLLECTION_TASK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task4 {

	
	public static void main(String[] args) {
		
		
		String s = "india";
		
		
		LinkedHashSet<Character> l = new LinkedHashSet();
		
		
		for (int i = 0; i < s.length(); i++) {
			
			l.add(s.charAt(i));
		}
		
		//System.out.println(l);
		
	 
		for (Character ch : l) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			//System.out.println(ch+"=="+count);  // i n d a
//			if(count==1) 
//			{
//				System.out.println(ch+"=="+count);  // n d a
//			}
			
		}
	
		
		
		
	}
	
}
