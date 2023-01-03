package Arrays;

public class RemoveDplicate {

	public static void main(String[] args) {
		
	int	a[]= {1,2,3,2,5,3,0};
	
	
	int k=0;
	for (int i =0; i < a.length-1; i++) {

		if(a[i]!=a[i+1]) 
		{
			a[k]=a[i];				
			k++;
		    i++;
		}
		a[k]=a[a.length-1];
	}
	for (int i = 0; i <=k; i++) {

		System.out.print(a[i]+" ");
	}	
	
	}

}
