package Arrays;

public class AppendZerosAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,1,0,1,0,0,1,2,82,0,56};

		int start=0;
		int end=a.length-1;

		int b[]= new int[a.length];

		for (int i = 0; i < b.length; i++) {

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

		for (int i = 0; i < b.length; i++) 

		{
			System.out.print(b[i]+" ");
		}

		System.out.println();
		for (int i = 5; i < b.length; i++)
		{

			for (int j = i+1; j < b.length; j++) 
			{

				if(b[i]>b[j]) 
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}		
	}

}


