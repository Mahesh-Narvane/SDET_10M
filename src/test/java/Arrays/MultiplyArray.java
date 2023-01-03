package Arrays;

public class MultiplyArray {

	public static void main(String[] args) {


		int a[] = {5,9,9,2,1,5,8,12,2,1};
		int b[]= new int [a.length]; 
				
				for (int i = 0; i < b.length; i++) {
			
			     b[i]=a[i]*a[i];
			     System.out.print(b[i]+" ");
		}
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if(b[i]<b[j]) 
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		int k=0;
		for (int i = 0; i < b.length-1; i++) {
			
			if(b[i]!=b[i+1]) 
			{
				b[k]=b[i];
				k++;
			}
			b[k]=b[b.length-1];
		}
		for (int i = 0; i <=k; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
