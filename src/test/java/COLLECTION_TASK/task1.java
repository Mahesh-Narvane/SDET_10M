package COLLECTION_TASK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task1 
{

	
	public static void main(String[] args) {
		
		String s = "abcdacbddacbcabd";
		
		LinkedHashSet<Character> l = new LinkedHashSet();
        for (int i = 0; i<s.length(); i++) {
			
        	l.add(s.charAt(i));
		}
        System.out.println(l);
      
        
        for (Character list : l) {
			for (int i = 0; i <s.length(); i++) {
				if(list.equals(s.charAt(i))) 
				{
					System.out.print(list);
				}
			}
			System.out.println();
		}
        
//       for (int i = 0; i <l.size(); i++) {
//		for (int j = 0; j <s.length(); j++) {
//			if(i.)
//			{
//				System.out.println(i);
//			}
//		}
//		System.out.println();
//	}
        
	}
	
}
