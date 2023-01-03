package COLLECTION_TASK;

import java.util.LinkedHashSet;

public class demo {

	public static void main(String[] args) {
		
		
		String s="aaaabbbbccccdddd";
	   // char[] ch=s.toCharArray();
	    
	    
	    
	    LinkedHashSet<Character> l = new LinkedHashSet();
	    
	    for (int i = 0; i < s.length(); i++) {
			
	    	l.add(s.charAt(i));
		}
	    
	  //  System.out.println(l);
	    
	    for (Character chara : l) {
			for (int i = 0; i < s.length(); i++) {
				
				if(chara.equals(s.charAt(i))) 
				{
					System.out.print(chara);
				}
			}
			System.out.println();
	    	
		}
	  
		
	}
	
}
