package COLLECTION_TASK;

import java.util.LinkedHashSet;

public class printTheUniqueWordFromString {

	
	public static void main(String[] args) {
		
		
		
		String s="welcome to tyss welcome to india";
		String [] sp=s.split(" ");
		
		
		
		LinkedHashSet<String> l = new LinkedHashSet<>();
		
		for (int i = 0; i < sp.length; i++) {
			
			l.add(sp[i]);
		}
		
		for (String ch : l) {
			int count=0;
			for (int i = 0; i < sp.length; i++) {
				
				if(ch.equals(sp[i])) 
				{
					count++;
				}
			}
//			System.out.println(ch+" "+count);
			if(count==1) 
			{
				System.out.println(ch+" "+count);
			}
		}
		
		
	}
}
