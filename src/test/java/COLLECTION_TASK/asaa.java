package COLLECTION_TASK;

import java.util.LinkedHashSet;

public class asaa {

	
	public static void main(String[] args) {
		
		
		String s = "india";
		int count=0;
		String s1="";
		
		LinkedHashSet<Character> h = new LinkedHashSet();
		
		for (int i = 0; i <s.length(); i++) {
			
			
			h.add(s.charAt(i));
			
		}
		
		for (Character list : h) {
			
			if(list=='a' || list=='e' || list=='i' || list=='o'  || list=='u') 
			{
				count++;
				
			}
		}
		System.out.println(s1+" "+count);
		
		
	}
	
}
