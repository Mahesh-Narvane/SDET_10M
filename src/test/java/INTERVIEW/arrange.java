package INTERVIEW;

public class arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "bfjkddgiytbhgsacx";
		char[] ch = s.toCharArray();
	

		for (int i = 0; i <ch.length; i++)
		{
			for (int j = 0; j <ch.length; j++) {

				if(ch[i]<ch[j]) 
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}

			}			
		}
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch[i]);
		}

	}

}
