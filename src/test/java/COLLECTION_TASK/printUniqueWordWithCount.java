package COLLECTION_TASK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class printUniqueWordWithCount {

	public static void main(String[] args) {
		
		
		String s = "welcome to tyss welcome to sdet ";
		String[] sp = s.split(" ");
	
		
		LinkedHashSet<String> l = new LinkedHashSet();
		
		
         for (int i = 0; i < sp.length; i++) {
			
        	 l.add(sp[i]);
        	 
		}
	
            for (String list : l) {
            	
            	int count=0;
            	for (int i = 0; i < sp.length; i++) {
					
            		if(list.equals(sp[i]))
            		{
            			count++;
            			
            		}
				}
            	if(count<2) 
            	{
            		System.out.println(list+" "+count);
            	}
				
			}        	
			
		}
	}
	          
	

