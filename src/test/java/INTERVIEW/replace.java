package INTERVIEW;

import java.util.Iterator;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,1,0,15,9,7};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				
				if((i==1 && j==5)||(i==2 && j==4)) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
