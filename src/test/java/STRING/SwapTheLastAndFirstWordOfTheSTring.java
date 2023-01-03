package STRING;

public class SwapTheLastAndFirstWordOfTheSTring {

	public static void main(String[] args) {
	
		
		String s= "i am from hyd";
		String []sp=s.split(" ");
		int start=0;
		int end=sp.length-1;
		
		for (int i = 0; i < sp.length; i++) {
			
			for (int j = i+1; j < sp.length; j++) {
				
			
			if(i==0 || i==7)
			{
				String temp=sp[start];
				sp[start]=sp[end];
				sp[end]=temp;
				start++;
				end--;
			}	
			}
			System.out.println(sp[i]);
		}
	}

}
