package INTERVIEW;

import java.util.Iterator;

public class WordFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= " we work to live and live to be happy live";
	    String	word="live";
		String[] sp = s.split(" ");
		int count=0;
		
		for (int i = 0; i < sp.length; i++) {
			
			if(word.equals(sp[i])) 
			{
				count++;
			}
			
		}
		System.out.println(word+" "+count);
		
			
		}
	}
		
	


