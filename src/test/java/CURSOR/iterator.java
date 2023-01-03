package CURSOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class iterator {       // we can traverse in only forward direction

	public static void main(String[] args) {


		
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(10);
		a.add("mahi");
		
		
		
	    Iterator i = a.iterator();
	    
//	    while(i.hasNext()) 
//	    {
//	    	System.out.println(i.next());
//	    }

 
	    
	    while(i.hasNext())
	    {
	    	Object obj = i.next();
	    	if(obj.equals(10)) 
	    	{
	    		i.remove();
	    		System.out.println("10 has bees removed");
	    		break;
	    	}
	    }
	    
	    System.out.println(a);
	    

	}

}
