package J_A_V_A_1;

public class Pr_2 {

	public static void main(String[] args) 
	{

           String s = "aabccddfaa";
           char[] ch = s.toCharArray();
           
           int freCount=0;
           
           for(int i=0;i<ch.length;i++)
           {
        	   int count=1;
        	   
        	   for(int j=i+1;j<ch.length;j++) 
        	   {
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
        	   if(count>1)
        	   {
        		   freCount++;
        	   }
        	   
           }
           System.out.println(s+" "+freCount);
	}

}
