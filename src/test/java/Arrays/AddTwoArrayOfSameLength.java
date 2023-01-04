package Arrays;

public class AddTwoArrayOfSameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[]= {1,2,3,4};
//		int b[]= {1,2,3,4};
//		
//		int c[]=new int[a.length];
//		
//
//		for (int i = 0; i < c.length; i++) {
//			
//			c[i]=a[i]+b[i];
//		}
//		for (int i = 0; i < c.length; i++) {
//			
//			System.out.print(c[i]+" ");
//		}
		
		
		
		int a =224;
		
		int sum =0; int rem1=0; 	int sum1 =0;
		int rem=0;
		
		while(a>22) 
		{
			rem=a%10; //3
			a=a/10;  //12
			sum=sum+rem;  //3
		}
		
		while(a>0) 
		{
			 rem1=a%10; //6
			 a=a/10; //0
			 sum1=sum1+rem1; //3
		}
		
		if(sum==sum1) 
		{
			System.out.println("it is equal");
		}
		else 
		{
			System.out.println("it is not equal");
		}
	}

}
