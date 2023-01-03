package Arrays;

public class AddTwoArrayOfDiffLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4};
		int[] b= {1,2,3,4,5};
		
		int length=b.length;                 // if we dont know that which array has bigger length then we can re assign the length by using this
		if(b.length<a.length)
		{
			length=a.length;
		}
		
	
		for (int i = 0; i < b.length; i++) {
			
			try{
				System.out.print(a[i]+b[i]+" ");
				}
			catch(Throwable e) 
			{
				if(b.length>a.length) 
				{
					System.out.print(b[b.length-1]+" ");
				}
				
			}
		}
	
		}
		
	}


