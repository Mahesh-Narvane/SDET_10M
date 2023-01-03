package STRING;

public class PrintAString {

	public static void main(String[] args) {
	
	
	// to ways to print the string	
		
		
		String s="mahesh";
//		char[] ch = s.toCharArray();                    
//		
//		for (int i = 0; i < ch.length; i++) {
//			
//			System.out.print(ch[i]+" ");
//		}
		
		
		for (int i = 0; i < s.length(); i++) {
			
			System.out.print(s.charAt(i));
		}
		
	}

}
