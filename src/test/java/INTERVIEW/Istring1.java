package INTERVIEW;

public class Istring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="@a#$c^*m%j";
		char[] ch = s.toCharArray();
		int start=0;
		int end = ch.length-1;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {	
				if(ch[start]>='a' && ch[start]<='z') 
				{
					if(ch[end]>='a' && ch[end]<='z') 
					{
						if(start<end) {
						char temp=ch[start];
						ch[start]=ch[end];
						ch[end]=temp;
						start++;
						end--;		
					}
					else 
					{
						end++;
					}
				}
				
				else 
				{
					start++;
				}
			}
		}
		}
		for (int i = 0; i < ch.length; i++) {
			
			System.out.print(ch[i]);}
}
}
