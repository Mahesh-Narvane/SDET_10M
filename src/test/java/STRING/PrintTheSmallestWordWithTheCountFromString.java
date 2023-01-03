package STRING;

public class PrintTheSmallestWordWithTheCountFromString {

	public static void main(String[] args) {

		String str="i sandeep sir";

		String []s =str.split("");	
		int min=s[0].length();
		String temp="";

		for (int i = 0; i <s.length; i++) {

			if (s[i].length()<=min) {
				min=s[i].length();
				temp=s[i]+" "+min;			
			}
		}

		System.out.println(temp);
	}
}
