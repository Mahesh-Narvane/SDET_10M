package COLLECTION_TASK;

import java.util.LinkedHashSet;

public class task11 {

	public static void main(String[] args) {


		
		String s = "testyantra";
		char[] ch1 = s.toCharArray();
		
		
		LinkedHashSet<Character> h = new LinkedHashSet();
		
		for (int i = 0; i < ch1.length; i++) {
			
		    h.add(ch1[i]);
		}
		System.out.println(h);
		
		
		
		for (Character ch : h) {
			
			for (int i = 0; i < ch1.length; i++) {
				
				if(ch.equals(ch1[i])) 
				{
					System.out.println(ch+" poition is "+(i+1));
					break;
				}
			}
		}
	}

}
