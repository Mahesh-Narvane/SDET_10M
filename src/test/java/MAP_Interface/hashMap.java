package MAP_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class hashMap {
	
	
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> h = new HashMap();      // it allows multiple null value but only one null key 
		
		h.put("Mahesh", 1000);
		h.put("Prabhas", 2000);
		h.put("rana", 3000);
		h.put("venkatesh", 4000);
		h.put("ntr", 5000);
		h.put("rana",6000);    // if we add duplicate value to the array it replace a old key 
		h.put(null, null);  
		h.put("mahi", null);
		h.put("sham", null);
		h.put(null, 10000);


		System.out.println(h);  // it will print in a random order because it follows hashtable structure internally
        System.out.println(h.keySet());
		Set<Entry<String, Integer>> eset = h.entrySet();

		for (Entry<String, Integer> entry : eset) 
		{
			System.out.println(entry);
		}

		// we can use iterator also to print the values one by one instead of for loop

		Iterator i = eset.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}



		Set<String> kset = h.keySet();
		for (String Kset : kset)
		{

			System.out.println(Kset);
		}


		Collection<Integer> val = h.values();

		for (Integer Values : val) 
		{

			System.out.println(Values);
		}


		
		
		
		
	}

}
