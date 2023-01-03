package STRING;

public class CountOvelsOfStringArray {

	public static void main(String[] args) {

		String s[]= {"testyantra","hyderabad","bangelore"};
	    
		for (int i = 0; i < s.length; i++) {
		String	str=s[i];
		int count=0;
		for (int j = 0; j < str.length(); j++) {
			      
		         char ch=str.charAt(j);
		         if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') 
		         {
		        	 count++;
		         }
		}
		System.out.println(str+" = "+count);
		
		}
	
	}

}
