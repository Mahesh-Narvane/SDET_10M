package STRING;

public class ReverseAnStringMethods {

	public static void main(String[] args) {
		
		String s="testyantra";
		char []ch=s.toCharArray();
		String rev="";
		for (int i=ch.length-1; i>=0; i--) {
			
			System.out.print(ch[i]+" ");
			
		}
		
		
		System.out.println();
		// using third variable
		
		String s1="mahesh";
		for (int i = 0; i < ch.length; i++) {
			
			rev=ch[i]+rev;
		}
		System.out.print(rev);
		
		
		
		System.out.println();
		// without using length() and length variable then we go for count
		
		String ss="mahesh";
		char []cc=ss.toCharArray();
		int count=0;
		for (char c : cc) {
			count++;
		}
		System.out.println(count);
		
		for (int i=count-1; i>=0; i--) {
			System.out.print(cc[i]);
		}
		
		
		// without using length() and length variable then we go for count and using third variable
		
		String a="mahesh";
     	char []aa=a.toCharArray();
		String bb="";
		int count1=0;
		
		for (char c : aa) {
			count1++;
		}
		for (int i=0; i<count; i++) {
			
			bb=aa[i]+bb;
			
		}
		System.out.print(bb+" ");
		
		
	}

}
