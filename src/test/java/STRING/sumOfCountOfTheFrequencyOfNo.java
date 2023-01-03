package STRING;

public class sumOfCountOfTheFrequencyOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="a11b22c33";
	       char[] ch = s.toCharArray();
		   int sum=0;
		   int n=0;
		for (int i = 0; i < ch.length; i++) {
		
			if(ch[i]>='0'  &&  ch[i]<='9') 
			{
				int num=ch[i]-48;
				n=n*10+num;
			}
			else 
			{
				sum=sum+n;
				n=0;
			}

		}
		System.out.println(sum+n);
		
		
	}

}
