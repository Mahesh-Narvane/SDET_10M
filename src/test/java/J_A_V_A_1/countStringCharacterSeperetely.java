package J_A_V_A_1;

public class countStringCharacterSeperetely {
	
	  
	public static void main(String[] args) {
	
		
		String str= "MaheshNarvane";
          String s = str.toUpperCase();
            char[] s1 = s.toCharArray();
            for(char ch='A';ch<='Z';ch++)
            {
            	int count=0;
            	for (int i = 0; i < s1.length; i++)
            	{
					if(ch==s1[i])
					{
						count++;
					}
				}
            	if(count>0) 
            	{
            		System.out.println(ch+" "+count);
            	}
            }

}
}