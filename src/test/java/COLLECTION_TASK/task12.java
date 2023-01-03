package COLLECTION_TASK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task12 {

	
	
	public static void main(String[] args) {
		
		
		
		String s = "khatam ta ta bye bye";
		String[] str = s.split(" ");
		int count=0;
		
		LinkedHashSet<String> h = new LinkedHashSet();
		
		for (int i = 0; i < str.length; i++) {
			
			h.add(str[i]);
			count++;
		}
	
		
		
		
		//System.out.println(h);
		
		
		for (String ch : h) {
			for (int i = 0; i < str.length; i++) {
				
				if(ch.equals(str[i])) 
				{
					System.out.println(ch+" position is "+(i+1));
					break;
				}
			}
		}
		
	}
	
}
