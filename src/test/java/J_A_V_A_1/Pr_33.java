package J_A_V_A_1;

public class Pr_33 {

	public static void main(String[] args) {

         String s = "@a*&b#%$c#$d";
         char[] ch = s.toCharArray();
         
         int left=0;
         int right=s.length()-1;
         
         for(int i=0;i<ch.length;i++) 
         {
        	  
        	 if(ch[left]>='a' && ch[left]<='z') {
        		 if(ch[right]>='a' && ch[right]<='z') {
        			 if(left<right) {
        				 
        				 char temp =ch[left];
        				 ch[left]=ch[right];
        				 ch[right]=temp;
        				 left++;
        				 right--;
        			 }
        			 
        		 }else {
        			 right--;
        		 }
        		 
        	 }
        	 else {
        		 left++;
        	 }
         }
         for(int i=0;i<ch.length;i++) {
        	 System.out.print(ch[i]);
         }
          

	}

}
