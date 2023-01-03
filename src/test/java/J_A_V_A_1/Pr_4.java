
package J_A_V_A_1;

public class Pr_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 String s = "T%O@Y!U";
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
         for(int i=0;i<ch.length;i++) 
         {
        	 System.out.print(ch[i]);
         }
	}

}
