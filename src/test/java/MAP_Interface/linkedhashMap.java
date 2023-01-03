package MAP_Interface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashMap 
{
    
	public static void main(String[] args)
	
	{
	   
	   LinkedHashMap h = new LinkedHashMap();
	   
	   
	   h.put("mahesh", 1000);
	   h.put("shubham", 2000);
	   h.put("siddhu", 3000);
	   h.put("kishan", 4000);
	   h.put("rohit", 5000);
	   h.put("ashish", 6000);
	   h.put(null, 0000);
	   h.put(null, null);
	   
	   
	   System.out.println(h);
	   
	   Set eset = h.entrySet();
	   for (Object Eset : eset) {
		System.out.println(Eset);
		
		// we can use iterator also

		Iterator i = eset.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	
		
	}
    
	}

}
