package INTERVIEW;

public class seperatewithcount
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	
		 String str= "rrrtttmmmaaa";
         char[] s= str.toCharArray();
         
         for(char ch='a'; ch<'z';ch++)
         {
        	 int count=0;
        	 for (int i = 0; i < s.length; i++) {
				
        		 if(ch==s[i]) 
        		 {
        			 count++;
        		 }
			}if(count>0) {
				System.out.print(ch+""+count);
			}
         }
	    }
}
