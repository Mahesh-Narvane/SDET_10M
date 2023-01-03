package INTERVIEW;

import java.util.Arrays;
import java.util.Iterator;

public class allign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {0,0,1,0,1,1,0};
		int start=0;
		int end=a.length-1;
		int[] b= new int [a.length];
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==0)
			{
				b[start]=a[i];
				start++;
			}
			else
			{
				b[end]=a[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(b));
	}		
}			
	     
	


