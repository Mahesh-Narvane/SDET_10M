package Arrays;

public class AddTwoArrayOfSameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		int c[]=new int[a.length];
		

		for (int i = 0; i < c.length; i++) {
			
			c[i]=a[i]+b[i];
		}
		for (int i = 0; i < c.length; i++) {
			
			System.out.print(c[i]+" ");
		}
	}

}
