package CURSOR;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {            // we can traverse in both direction

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		a.add(2);
		a.add(10);
		a.add("mahi");
	  
	    ListIterator li = a.listIterator();
	    
	    
//	    // to move cursor in forward direction
//	    while(li.hasNext()) 
//	    {
//	    	System.out.println(li.next());
//	    }
//	    
//	    
//	    // to move cursor in backward direction
//	    
//	    while(li.hasPrevious()) 
//	    {
//	    	System.out.println(li.previous());
//	    }
	    
	    
	    
	    // use of remove method
	    
//	    while(li.hasNext()) 
//	    {
//	    	System.out.println(li.next());
//	    }
//	    
//	    
//	    while(li.hasPrevious()) 
//	    {
//	     Object obj = li.previous();
//	     if(obj.equals(10)) 
//	     {
//	    	 li.remove();
//	    	 System.out.println("10 has been removed");
//	    	 break;
//	     }
//	    }
//	    System.out.println(a);
	    
	    
	    // to use add method
	    
	    while(li.hasNext()) 
	    {
	   Object obj = li.next();
	   if(obj.equals("mahi")) 
	   {
		   li.add(500);
	   }
	    }
	    System.out.println(a);
}

}
