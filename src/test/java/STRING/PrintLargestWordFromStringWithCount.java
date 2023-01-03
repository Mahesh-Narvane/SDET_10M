package STRING;

public class PrintLargestWordFromStringWithCount {

	public static void main(String[] args) {
		
		
		String s ="Hi sandeep sir k";
		String[] ch = s.split(" ");
		int max = ch[0].length();
		String temp= ch[0];

		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i].length()>max) 
			{
				max=ch[i].length();
				temp=ch[i];
			}
		}
		System.out.println(max);
		System.out.println(temp);
	}
}
