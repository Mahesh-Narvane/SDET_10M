package STRING;

import java.util.Iterator;

public class SumOfDigitOfANumber {

	public static void main(String[] args) {
		
	
		int num=241;
		int temp=0;
		int sum=0;
		
		while(num!=0) 
		{
			temp=num%10;
			
			if(temp%2==0) 
			{
				sum=sum+temp;
			}
			
			num=num/10;
		}
		System.out.println(sum);
		
		
	}
}
		
	