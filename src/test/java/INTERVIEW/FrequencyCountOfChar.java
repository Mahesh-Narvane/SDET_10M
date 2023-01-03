package INTERVIEW;

import java.util.Iterator;

public class FrequencyCountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaatttrrrr";
		char[] ch = s.toCharArray();	
		
		for (int i = 0; i <ch.length; i++) {
			int count=1;
			for (int j = i+1; j < ch.length; j++) {

				if(ch[i]==ch[j])
				{
					count++;
					i++;
				}
				else 
				{
					break;
				}
			}
			System.out.print(ch[i]+""+count);
		}

	}
}
