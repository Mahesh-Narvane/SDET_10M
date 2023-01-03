package MAP_Interface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashTable {

	
	public static void main(String[] args) {
		


		Hashtable<String, Integer> h = new Hashtable();

		h.put("Mahesh", 1000);
		h.put("Prabhas", 2000);
		h.put("rana", 3000);
		h.put("venkatesh", 4000);
		h.put("ntr", 5000);
		h.put("rana",6000);     // if we add duplicate value to the array it replace a old key 


		System.out.println(h);  // it will print in a random order because it follows hashtable structure internally

		Set<Entry<String, Integer>> eset = h.entrySet();

		for (Entry<String, Integer> entry : eset) 
		{
			System.out.println(entry);
		}

		for (Entry<String, Integer> en : eset) {
			System.out.println(en.getKey()+"=="+en.getValue());
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


		// to remove specific key
	     h.remove("ntr");
		//System.out.println(re);
		System.out.println(h);

	}

	
}
