package STRING;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="aaabbbcccdddd";   //abcd  // this logic will work only if string is in sequencial order
	    char[] ch=s.toCharArray();
		
		String s1="";
		
		for (int i = 0; i < ch.length; i++) {
			
			char cha= ch[i];
			
			if(s1.indexOf(cha)==-1) 
			{
				s1=s1+ch[i];
			}
		}
	
		System.out.println(s1);
		
		
	
		
	}

}
