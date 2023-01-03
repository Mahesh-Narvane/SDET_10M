package COLLECTION_TASK;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintTheCountOfCharacterUsingHashMap 
{


	  public static void main(String[] args) {
		
		  
		  String s ="testyantra";
		  
		  
		  HashMap< Character, Integer> h = new HashMap();
		  
		  for (int i = 0; i < s.length(); i++) {
			
			  if(h.containsKey(s.charAt(i))==false) 
			  {
				  h.put(s.charAt(i), 1);
			  }
			  else 
			  {
				  int oldvalue=h.get(s.charAt(i));
				  int newvalue=oldvalue+1;
				  h.put(s.charAt(i), newvalue);
			  }
		}
		  System.out.println(h.values());
		  
		  Set<Entry<Character, Integer>> entry = h.entrySet();
		  for (Entry<Character, Integer> entry2 : entry) {
			
			  System.out.println(entry2);
		}
	}
}
