package Arrays;

public class PrintMissingNoFromArray {

	public static void main(String[] args) {


		int[] a = {1,2,3,4,5,8,10};
		boolean status=true;
		
		for (int i = 1; i<=100; i++)
		{
			for (int j = 0; j<a.length; j++)
			{
				if(i==a[j]) 
				{
					status=false;
					break;
				}
				
			}
			
			if(status==true) 
			{
				System.out.println(i+" ");
			}
			status=true;
		
			
		}

	}

}
