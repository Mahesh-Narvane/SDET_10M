package J_A_V_A_1;

public class Pr_3 {

	public static void main(String[] args) {
		
		
		String s = "a*#b*%_z*c$";
	    char[] ch = s.toCharArray();
		 int left = 0;
		 int right = s.length()-1;
		
		 for(int i=0;i<ch.length;i++) 
		 {
			  char chl = s.charAt(left);
			  char chr = s.charAt(right); 
			  
              if(ch[left]>='a' && ch[left]<='z')            //s.charAt(left)>='a' && s.charAt(right)<='z'
              {
            	  if(ch[right]>='a' && ch[right]<='z') 
            	  {
            		  if(left<right) 
            		  {
            		  char temp=chl;
            		  chl=chr;
            		  chr= temp;                         //ch[left]>='a' && ch[left]<='z'
            		
            		  left++;
            		  right--;
            		  }
            	  }
            	  else 
            	  {
            		  right--;
            	  }
            	
                } 
                else 
              {
        		 left++;
        	  }
      
		 }
		 String str = new String();
		 String string = str.valueOf(str); 
		 System.out.println(string);
		  
          
		 
	 
	    
	
	}

}
