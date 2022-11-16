package J_A_V_A_1;

public class Pr_1 {

	public static void main(String[] args) {
	
		
		String s = "aabcc";
		char[] ch = s.toCharArray();    // [a,a,b,c,c] to convert string into character we use this
		
		for(int i=0;i<ch.length;i++) {
			  int count=1;                  // to compair "a" with whole string we take count as 1 
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					count++;
					i++;
				}
				else {
					break;
				}
			}
			System.out.print(ch[i]+""+count);
			
		}

	}

}
