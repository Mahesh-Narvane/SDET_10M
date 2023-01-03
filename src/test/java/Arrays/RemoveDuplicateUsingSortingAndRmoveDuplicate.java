package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateUsingSortingAndRmoveDuplicate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] ={2,2,5,1,1,5,9,4,7,1,98,50,50};
		
	
		for (int i = 0; i < a.length; i++) {
		
			for (int j = 0; j < a.length; j++) {
			
				if(a[i]<a[j]) 
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
	
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//	
		
		System.out.println();
		System.out.println();
		
		int k=0;
		for (int i =0; i < a.length-1; i++) {

			if(a[i]!=a[i+1]) 
			{
				a[k]=a[i];				
				k++;
			}
			a[k]=a[a.length-1];
		}
		for (int i = 0; i <=k; i++) {

			System.out.print(a[i]+" ");
		}
		
		
	}

}
