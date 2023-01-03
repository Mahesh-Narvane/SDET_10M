package COLLECTION_TASK;

import java.util.LinkedHashSet;

public class task5 {

	
	public static void main(String[] args) {
		
		
		String s = "welcome to india welcome to tyss";
		String[] ch = s.split(" ");
		
		LinkedHashSet<String>l = new LinkedHashSet();
		
		for (int i = 0; i < ch.length; i++) {
			
			l.add(ch[i]);
		}
		
		//System.out.print(l);
		
		
		
		for (String ch1 : l) {
			int count =0;
			for (int i = 0; i < ch.length; i++) {
				
				if(ch1.equals(ch[i])) 
				{
					count++;
				}
			}
			
			//System.out.println(ch1+"=="+count);
//			if(count==1) 
//			{
//				System.out.println(ch1+"=="+count);
//			}		
			System.out.print(ch1.toString());
		}
		
	}
	
}
