package MAP_Interface;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeMap;

public class treemap
{
    public static void main(String[] args) {
		
    	
    	// the main purpose of using tree map that it will sort on the basis on key only
    	
    	TreeMap<Integer, String> t = new TreeMap();
    	
    	t.put(12, "abc");
    	t.put(10, "ssg");     // it will not accept null key
    	t.put(8, "d");       
    	t.put(6, null);       // it will allow null values
    	t.put(4, "full");
    	t.put(2, "gkl");
    	
    	System.out.println(t);
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
        System.out.println(t.headMap(8));
        System.out.println(t.tailMap(6));
        
        NavigableSet<Integer> des = t.descendingKeySet();
    	
        for (Integer inte : des) {
			System.out.println(inte);
		}
        
            
        Collection<String> dsm = t.descendingMap().values();
        for (String str : dsm) {
			
        	System.out.println(str);
		}
        
        System.out.println(t.subMap(2, 8));      // it will act as substring
       
	
        
    	}
	
}
