package Arrays;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,2,3,4,4,5};
		int k=0;
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]!=a[i+1]) 
			{
				a[k]=a[i];
				k++;
			}	
		}
		    a[k]=a[a.length-1];
			for (int i = 0; i <=k; i++) 
			{
				System.out.print(a[i]+" ");
			}
		
		}
		
	}


